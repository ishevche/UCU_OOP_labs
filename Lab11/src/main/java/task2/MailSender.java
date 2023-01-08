package task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Emailv31;
import lombok.SneakyThrows;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {

    @SneakyThrows
    public void sendMail(MailInfo info) {
        String name = info.getClientName();
        String email = info.getClientEmail();
        String text = info.generate();

        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient(System.getenv("****************************1234"),
                System.getenv("****************************abcd"), new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "ivan.shevchenko@ucu.edu.ua")
                                        .put("Name", "Ivan"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", email)
                                                .put("Name", name)))
                                .put(Emailv31.Message.SUBJECT, "Hi from Ivan!")
                                .put(Emailv31.Message.TEXTPART, text)));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}

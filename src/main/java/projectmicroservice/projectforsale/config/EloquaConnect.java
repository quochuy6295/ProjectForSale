package projectmicroservice.projectforsale.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class EloquaConnect {

    // Thông tin kết nối Eloqua
    String siteName = "YOUR_SITE_NAME";
    String userName = "YOUR_USER_NAME";
    String password = "YOUR_PASSWORD";

        try {
        // Tạo đối tượng kết nối Eloqua
        EloquaClient client = new EloquaClient(siteName, userName, password);

        // Lấy thông tin dịch vụ Eloqua
        ServiceInfo serviceInfo = client.getServiceInfo();
        System.out.println("Eloqua service version: " + serviceInfo.getVersion());

        // Ví dụ: Lấy danh sách liên hệ từ Eloqua
        ContactsClient contactsClient = client.getContactsClient();
        Contacts contacts = contactsClient.getContacts();
        for (Contact contact : contacts.getElements()) {
            System.out.println("Contact ID: " + contact.getId());
            System.out.println("Contact Name: " + contact.getFirstName() + " " + contact.getLastName());
        }

        // Đóng kết nối Eloqua
        client.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

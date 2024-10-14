package app.schedule.model;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "member")
@Data
public class Member {

    @Id
    private String _id;
    private String user_email;
    private String user_id;
    private String user_name;
    private String user_password;
}

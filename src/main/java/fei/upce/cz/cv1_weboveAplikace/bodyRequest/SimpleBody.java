package fei.upce.cz.cv1_weboveAplikace.bodyRequest;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SimpleBody {
    private String firstName;
    private String lastName;
    private int age;
}

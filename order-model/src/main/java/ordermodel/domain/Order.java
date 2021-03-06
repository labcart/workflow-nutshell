package ordermodel.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Bhuwan Upadhyay
 */
@Getter
@Setter
public class Order {
    private Long id;
    private String detail;
    private String state;
    private String processInstanceId;
}

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transition {
    private String line;
    private String station;
}

package common.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PerformType {
    private String address;
    private List<String> dateAndTimes;
    private List<Seat> seats;
}

package app.nsoz.mnt.bgates.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

/**
 * Description Class
 *
 * @author khanh
 * @version v1
 * @date 6/20/2021
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankInfo {

    private String name;
    private String creditStatus; // - GOOD - | - ERROR - |
    private String description;
    private LocalDateTime createdDate;
}

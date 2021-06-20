package app.nsoz.mnt.bgates.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description Class
 *
 * @author khanh
 * @version v1
 * @date 6/20/2021
 */
@RestController
@RequestMapping("/tracks")
public interface TrackingResource {

    /**
     *  Remember to finish this :)
     * @return
     */
    Object getAll();

    Object getOne(@PathVariable(required = false) String name);

    Object credit(String bankName, Object model, boolean isTrans);

    Object debit(String bankName, Object model, boolean isTrans);

    Object checkTrans(String bankname, String transId);

    Object updateDebit(String bankName);

    Object updateCredit(String bankName);
}

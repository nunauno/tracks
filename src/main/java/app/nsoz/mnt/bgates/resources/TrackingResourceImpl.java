package app.nsoz.mnt.bgates.resources;

import app.nsoz.mnt.bgates.processor.TrackingProcessor;
import app.nsoz.mnt.bgates.utils.TrackingUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description Class
 *
 * @author khanh
 * @version v1
 * @date 6/20/2021
 */

@RequiredArgsConstructor
public class TrackingResourceImpl implements TrackingResource {

    private final TrackingProcessor tp;


    @Override
    public Object getAll() {
        return tp.healthCheckAll();
    }

    @Override
    public Object getOne(String name) {
        if (TrackingUtil.isExists(name)) {
            return "BANK NOT EXISTS!!!";
        }
        // todo find bank
        // call local -> server uat - via ip
        return null;
    }

    @Override
    public Object credit(String bankName, Object model, boolean isTrans) {
        return null;
    }

    @Override
    public Object debit(String bankName, Object model, boolean isTrans) {
        return null;
    }

    @Override
    public Object checkTrans(String bankname, String transId) {
        return null;
    }

    @Override
    public Object updateDebit(String bankName) {
        return null;
    }

    @Override
    public Object updateCredit(String bankName) {
        return null;
    }

}

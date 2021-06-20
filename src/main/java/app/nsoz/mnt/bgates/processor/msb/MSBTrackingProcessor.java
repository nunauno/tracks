package app.nsoz.mnt.bgates.processor.msb;

import app.nsoz.mnt.bgates.processor.TrackingProcessor;

/**
 * Description Class
 *
 * @author khanh
 * @version v1
 * @date 6/20/2021
 */
public class MSBTrackingProcessor implements TrackingProcessor {
    @Override
    public boolean healthCheck(String name) {
        return false;
    }

    @Override
    public boolean healthCheckAll() {
        return false;
    }

    @Override
    public boolean credit(Object o, Boolean isTrans) {
        return false;
    }

    @Override
    public boolean debit(Object o) {
        return false;
    }

    @Override
    public boolean checkTrans(Object o) {
        return false;
    }

    @Override
    public boolean updateDebit(Object o) {
        return false;
    }

    @Override
    public boolean updateCredit(Object o) {
        return false;
    }
}

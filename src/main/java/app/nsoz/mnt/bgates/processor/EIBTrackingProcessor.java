package app.nsoz.mnt.bgates.processor;

/**
 * Description Class
 *
 * @author khanh
 * @version v1
 * @date 6/20/2021
 */
public class EIBTrackingProcessor implements TrackingProcessor{
    @Override
    public boolean healthCheck(String name) {
        return false;
    }

    @Override
    public boolean healthCheckAll() {
        return false;
    }
}

package app.nsoz.mnt.bgates.processor;

/**
 * Description Class
 *
 * @author khanh
 * @version v1
 * @date 6/20/2021
 */

public interface TrackingProcessor {

    /**
     *  Verify if all is connected
     * @return
     */
    boolean healthCheck(String name);


    boolean healthCheckAll();

    /* main api */
    boolean credit(Object o, Boolean isTrans);

    boolean debit(Object o);

    boolean checkTrans(Object o);

    /**
     * IF Async Verify if both update were success.
     * @return
     */
    boolean updateDebit(Object o);
    boolean updateCredit(Object o);





}

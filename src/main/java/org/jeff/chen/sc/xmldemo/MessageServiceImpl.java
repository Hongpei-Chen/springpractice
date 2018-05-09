package org.jeff.chen.sc.xmldemo;

/**
 * @author jeff
 * <p>Date 2018/4/26 16:10</p>
 */
public class MessageServiceImpl implements MessageService {

    private MessageDao messageDao;

    public void setMessageDao(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    @Override
    public String getMessage() {
        return messageDao.getMessage();
    }


}

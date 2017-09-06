package com.quinnnorris.ssm.basejson;

/**
 * Title: BaseJson
 * Description: BaseJson类作为各个层次间传输数据的工具
 * Company: www.QuinnNorris.com
 *
 * @date: 2017/9/5 下午7:33 星期二
 * @author: quinn_norris
 * @version: 1.0
 */
public class BaseJson {

    private String errorCode;
    private Object object;

    public BaseJson() {
    }

    public BaseJson(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

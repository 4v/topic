

/**
 * @Title: BaseController.java
 * @Package com.dyenigma.controller
 * @author dingdongliang
 * @date 2015年9月14日 下午5:19:50
 * @version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.controller;

import com.dyenigma.model.Json;
import com.dyenigma.utils.Constants;

/**
 * @author dingdongliang
 * @ClassName: BaseController
 * @Description: 控制器基类，用于编写统一使用方法
 * @date 2015年9月14日 下午5:19:50
 */

public class BaseController {

    public Json getMessage(boolean flag) {
        Json json = new Json();
        if (flag) {
            json.setStatus(true);
            json.setMessage(Constants.POST_DATA_SUCCESS);
        } else {
            json.setMessage(Constants.POST_DATA_FAIL);
        }
        return json;
    }
}

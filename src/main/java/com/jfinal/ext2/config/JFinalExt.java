/**
 * Copyright (c) 2015-2016, BruceZCQ (zcq@zhucongqi.cn).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.jfinal.ext2.config;

import com.jfinal.core.JFinal;

/**
 * @author BruceZCQ
 *
 */
final public class JFinalExt {

    /**
     * 开发模式
     */
    public static boolean DEV_MODE = JFinal.me().getConstants().getDevMode();

    /**
     * 文件上传目录
     */
    public static String UPLOAD_PATH = JFinal.me().getConstants().getBaseUploadPath();

    /**
     * 文件下载目录
     */
    public static String DOWNLOAD_PATH = JFinal.me().getConstants().getBaseDownloadPath();

    /**
     * 编码
     */
    public static String ENCODING = JFinal.me().getConstants().getEncoding();

}

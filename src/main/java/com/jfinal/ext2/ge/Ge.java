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
package com.jfinal.ext2.ge;

import com.jfinal.ext2.config.StandaloneDbConfig;

/**
 * Generate Tool
 * @author BruceZCQ
 */
public class Ge {

    /**
     * Generate the models and base models
     * @param args
     */
    public static void main(String[] args) {
        StandaloneDbConfig.startGe();
    }

}

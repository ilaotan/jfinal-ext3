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
package com.jfinal.ext2.kit;

import javax.xml.bind.DatatypeConverter;


/**
 * @author BruceZCQ
 */
final public class HexKit {

    public static byte[] HexStringToBytes(String hexString) {
        return DatatypeConverter.parseHexBinary(hexString);
    }


    public static String byteToHexString(byte[] src) {
        return DatatypeConverter.printHexBinary(src);
    }
}

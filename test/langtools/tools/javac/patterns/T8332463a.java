/*
 * Copyright (c) 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * @test
 * @bug 8332463
 * @summary Byte conditional pattern case element dominates short constant case element
 * @compile --enable-preview --source ${jdk.version} T8332463a.java
 */
public class T8332463a {
    public int test2() {
        Byte i = (byte) 42;
        return switch (i) {
            case Byte ib  -> 1;
            case short s  -> 2;
        };
    }

    public int test4() {
        int i = 42;
        return switch (i) {
            case Integer ib -> 1;
            case byte ip    -> 2;
        };
    }

    public int test3() {
        int i = 42;
        return switch (i) {
            case Integer ib -> 1;
            case (byte) 0   -> 2;
        };
    }
}

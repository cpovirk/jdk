/*
 * Copyright (c) 2008, 2023, Oracle and/or its affiliates. All rights reserved.
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
 *
 */
package com.sun.hotspot.igv.graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas Wuerthinger
 */
public class AndSelector implements Selector {

    private Selector[] selectors;

    public AndSelector(Selector[] selectors) {
        this.selectors = selectors;
    }

    @Override
    public List<Figure> selected(Diagram d) {
        List<Figure> result = d.getFigures();
        for (Selector s : selectors) {
            List<Figure> selected = s.selected(d);
            List<Figure> newResult = new ArrayList<>();
            for (Figure f : result) {
                if (selected.contains(f)) {
                    newResult.add(f);
                }
            }
            result = newResult;
        }
        return result;
    }
}

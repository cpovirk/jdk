/*
 * Copyright (c) 2000, 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
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

package javax.print.attribute.standard;

import org.jspecify.annotations.Nullable;

import javax.print.attribute.Attribute;
import javax.print.attribute.IntegerSyntax;
import javax.print.attribute.PrintServiceAttribute;

/**
 * Class {@code PagesPerMinuteColor} is an integer valued printing attribute
 * that indicates the nominal number of pages per minute to the nearest whole
 * number which may be generated by this printer when printing color (e.g.,
 * simplex, color). For purposes of this attribute, "color" means the same as
 * for the {@link ColorSupported ColorSupported} attribute, namely, the device
 * is capable of any type of color printing at all, including highlight color as
 * well as full process color. This attribute is informative, not a service
 * guarantee. Generally, it is the value used in the marketing literature to
 * describe the color capabilities of this device. A value of 0 indicates a
 * device that takes more than two minutes to process a page. If a color device
 * has several color modes, it may use the pages-per- minute value for this
 * attribute that corresponds to the mode that produces the highest number.
 * <p>
 * A black and white only printer must not include the
 * {@code PagesPerMinuteColor} attribute in its attribute set or service
 * registration. If this attribute is present, then the
 * {@link ColorSupported ColorSupported} printer description attribute must also
 * be present and have a value of {@code SUPPORTED}.
 * <p>
 * <b>IPP Compatibility:</b> The integer value gives the IPP integer value. The
 * category name returned by {@code getName()} gives the IPP attribute name.
 *
 * @author Alan Kaminsky
 */
public final class PagesPerMinuteColor extends IntegerSyntax
        implements PrintServiceAttribute {

    /**
     * Use serialVersionUID from JDK 1.4 for interoperability.
     */
    static final long serialVersionUID = 1684993151687470944L;

    /**
     * Construct a new pages per minute color attribute with the given integer
     * value.
     *
     * @param  value Integer value
     * @throws IllegalArgumentException if {@code value} is negative
     */
    public PagesPerMinuteColor(int value) {
        super(value, 0, Integer.MAX_VALUE);
    }

    /**
     * Returns whether this pages per minute color attribute is equivalent to
     * the passed in object. To be equivalent, all of the following conditions
     * must be true:
     * <ol type=1>
     *   <li>{@code object} is not {@code null}.
     *   <li>{@code object} is an instance of class {@code PagesPerMinuteColor}.
     *   <li>This pages per minute attribute's value and {@code object}'s value
     *   are equal.
     * </ol>
     *
     * @param  object {@code Object} to compare to
     * @return {@code true} if {@code object} is equivalent to this pages per
     *         minute color attribute, {@code false} otherwise
     */
    
    
    public boolean equals(@Nullable Object object) {
        return (super.equals(object) &&
                object instanceof PagesPerMinuteColor);
    }

    /**
     * Get the printing attribute class which is to be used as the "category"
     * for this printing attribute value.
     * <p>
     * For class {@code PagesPerMinuteColor}, the category is class
     * {@code PagesPerMinuteColor} itself.
     *
     * @return printing attribute class (category), an instance of class
     *         {@link Class java.lang.Class}
     */
    public final Class<? extends Attribute> getCategory() {
        return PagesPerMinuteColor.class;
    }

    /**
     * Get the name of the category of which this attribute value is an
     * instance.
     * <p>
     * For class {@code PagesPerMinuteColor}, the category name is
     * {@code "pages-per-minute-color"}.
     *
     * @return attribute category name
     */
    public final String getName() {
        return "pages-per-minute-color";
    }
}

/*
 * Copyright (c) 2018, 2020, Oracle and/or its affiliates. All rights reserved.
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
 *
 * @summary converted from VM Testbase nsk/jvmti/scenarios/sampling/SP05/sp05t002.
 * VM Testbase keywords: [quick, jpda, jvmti, noras]
 * VM Testbase readme:
 * DESCRIPTION
 *     This JVMTI test is for SP05 scenario of "time sampling profiling" area.
 *     This test checks that JVMTI methods GetFramesCount() and GetStackTrace()
 *     returns zero number of stack frames on THREAD_START and THREAD_END events.
 *     Threads are not suspended and these functions are invoked from events callbacks.
 *     The following threads in debuggee class are tested:
 *         RunningJava     - with Java language method run()
 *         RunningNative   - with native method run()
 *     Testcases:
 *         - enable events
 *         - start threads
 *         - check stack frames of threads on THREAD_START event
 *         - finish threads
 *         - check stack frames of threads on THREAD_END event
 * COMMENTS
 *
 * @library /vmTestbase
 *          /test/lib
 * @run main/othervm/native
 *      -agentlib:sp05t002=-waittime=5
 *      nsk.jvmti.scenarios.sampling.SP05.sp05t002
 */


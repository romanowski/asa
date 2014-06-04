package org.romanowski.asa.stacktrace.model

import org.romanowski.asa.model.{JvmVal, JvmFrame}

/**
 * Created with IntelliJ IDEA.
 * User: krzysiek
 * Date: 5/14/14
 * Time: 5:45 PM
 * To change this template use File | Settings | File Templates.
 */
class AsynchFrame(jvmFrame: JvmFrame, hasAllValues: Boolean, localValues: Seq[JvmVal], thread: Long)
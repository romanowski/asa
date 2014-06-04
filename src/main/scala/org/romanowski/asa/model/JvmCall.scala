package org.romanowski.asa.model

/**
 * Created with IntelliJ IDEA.
 * User: krzysiek
 * Date: 5/14/14
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
case class JvmCall(thread: Long, time: Long, stacktrace: Seq[JvmFrame], vars: Seq[JvmVal])


package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "FileFaultFault", targetNamespace = "urn:vim25")
public class FileFaultFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FileFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public FileFaultFaultMsg(String message, FileFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public FileFaultFaultMsg(String message, FileFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.FileFault
     */
    public FileFault getFaultInfo() {
        return faultInfo;
    }

}
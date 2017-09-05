

/**
 * RoleServicesImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */

    package org.tonglbin.services.role;

    /*
     *  RoleServicesImpl java interface
     */

    public interface RoleServicesImpl {
          

        /**
          * Auto generated method signature
          * 
                    * @param getRole0
                
         */

         
                     public org.tonglbin.services.role.GetRoleResponse getRole(

                        org.tonglbin.services.role.GetRole getRole0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getRole0
            
          */
        public void startgetRole(

            org.tonglbin.services.role.GetRole getRole0,

            final org.tonglbin.services.role.RoleServicesImplCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    
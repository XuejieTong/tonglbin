

/**
 * UserServicesImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */

    package org.tonglbin.services.user;

    /*
     *  UserServicesImpl java interface
     */

    public interface UserServicesImpl {
          

        /**
          * Auto generated method signature
          * 
                    * @param getUser0
                
         */

         
                     public org.tonglbin.services.user.GetUserResponse getUser(

                        org.tonglbin.services.user.GetUser getUser0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getUser0
            
          */
        public void startgetUser(

            org.tonglbin.services.user.GetUser getUser0,

            final org.tonglbin.services.user.UserServicesImplCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    
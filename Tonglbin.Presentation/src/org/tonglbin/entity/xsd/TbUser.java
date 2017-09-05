
/**
 * TbUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:58 BST)
 */

            
                package org.tonglbin.entity.xsd;
            

            /**
            *  TbUser bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class TbUser
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = TbUser
                Namespace URI = http://entity.tonglbin.org/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for Answer
                        */

                        
                                    protected java.lang.String localAnswer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnswerTracker = false ;

                           public boolean isAnswerSpecified(){
                               return localAnswerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAnswer(){
                               return localAnswer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Answer
                               */
                               public void setAnswer(java.lang.String param){
                            localAnswerTracker = true;
                                   
                                            this.localAnswer=param;
                                       

                               }
                            

                        /**
                        * field for Applicationname
                        */

                        
                                    protected java.lang.String localApplicationname ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localApplicationnameTracker = false ;

                           public boolean isApplicationnameSpecified(){
                               return localApplicationnameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getApplicationname(){
                               return localApplicationname;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Applicationname
                               */
                               public void setApplicationname(java.lang.String param){
                            localApplicationnameTracker = true;
                                   
                                            this.localApplicationname=param;
                                       

                               }
                            

                        /**
                        * field for Comments
                        */

                        
                                    protected java.lang.String localComments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommentsTracker = false ;

                           public boolean isCommentsSpecified(){
                               return localCommentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getComments(){
                               return localComments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comments
                               */
                               public void setComments(java.lang.String param){
                            localCommentsTracker = true;
                                   
                                            this.localComments=param;
                                       

                               }
                            

                        /**
                        * field for Createdate
                        */

                        
                                    protected java.util.Calendar localCreatedate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreatedateTracker = false ;

                           public boolean isCreatedateSpecified(){
                               return localCreatedateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCreatedate(){
                               return localCreatedate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Createdate
                               */
                               public void setCreatedate(java.util.Calendar param){
                            localCreatedateTracker = true;
                                   
                                            this.localCreatedate=param;
                                       

                               }
                            

                        /**
                        * field for Email
                        */

                        
                                    protected java.lang.String localEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmailTracker = false ;

                           public boolean isEmailSpecified(){
                               return localEmailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmail(){
                               return localEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Email
                               */
                               public void setEmail(java.lang.String param){
                            localEmailTracker = true;
                                   
                                            this.localEmail=param;
                                       

                               }
                            

                        /**
                        * field for Failedpasswordanswerattemptcount
                        */

                        
                                    protected int localFailedpasswordanswerattemptcount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFailedpasswordanswerattemptcountTracker = false ;

                           public boolean isFailedpasswordanswerattemptcountSpecified(){
                               return localFailedpasswordanswerattemptcountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getFailedpasswordanswerattemptcount(){
                               return localFailedpasswordanswerattemptcount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Failedpasswordanswerattemptcount
                               */
                               public void setFailedpasswordanswerattemptcount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localFailedpasswordanswerattemptcountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localFailedpasswordanswerattemptcount=param;
                                       

                               }
                            

                        /**
                        * field for Failedpasswordanswerattemptwindowstart
                        */

                        
                                    protected java.util.Calendar localFailedpasswordanswerattemptwindowstart ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFailedpasswordanswerattemptwindowstartTracker = false ;

                           public boolean isFailedpasswordanswerattemptwindowstartSpecified(){
                               return localFailedpasswordanswerattemptwindowstartTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getFailedpasswordanswerattemptwindowstart(){
                               return localFailedpasswordanswerattemptwindowstart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Failedpasswordanswerattemptwindowstart
                               */
                               public void setFailedpasswordanswerattemptwindowstart(java.util.Calendar param){
                            localFailedpasswordanswerattemptwindowstartTracker = true;
                                   
                                            this.localFailedpasswordanswerattemptwindowstart=param;
                                       

                               }
                            

                        /**
                        * field for Failedpasswordattemptcount
                        */

                        
                                    protected int localFailedpasswordattemptcount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFailedpasswordattemptcountTracker = false ;

                           public boolean isFailedpasswordattemptcountSpecified(){
                               return localFailedpasswordattemptcountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getFailedpasswordattemptcount(){
                               return localFailedpasswordattemptcount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Failedpasswordattemptcount
                               */
                               public void setFailedpasswordattemptcount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localFailedpasswordattemptcountTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localFailedpasswordattemptcount=param;
                                       

                               }
                            

                        /**
                        * field for Failedpasswordattemptwindowstart
                        */

                        
                                    protected java.util.Calendar localFailedpasswordattemptwindowstart ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFailedpasswordattemptwindowstartTracker = false ;

                           public boolean isFailedpasswordattemptwindowstartSpecified(){
                               return localFailedpasswordattemptwindowstartTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getFailedpasswordattemptwindowstart(){
                               return localFailedpasswordattemptwindowstart;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Failedpasswordattemptwindowstart
                               */
                               public void setFailedpasswordattemptwindowstart(java.util.Calendar param){
                            localFailedpasswordattemptwindowstartTracker = true;
                                   
                                            this.localFailedpasswordattemptwindowstart=param;
                                       

                               }
                            

                        /**
                        * field for Field
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localField ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFieldTracker = false ;

                           public boolean isFieldSpecified(){
                               return localFieldTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getField(){
                               return localField;
                           }

                           
                        


                               
                              /**
                               * validate the array for Field
                               */
                              protected void validateField(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Field
                              */
                              public void setField(java.lang.String[] param){
                              
                                   validateField(param);

                               localFieldTracker = true;
                                      
                                      this.localField=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addField(java.lang.String param){
                                   if (localField == null){
                                   localField = new java.lang.String[]{};
                                   }

                            
                                 //update the setting tracker
                                localFieldTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localField);
                               list.add(param);
                               this.localField =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

                             }
                             

                        /**
                        * field for Isanonymous
                        */

                        
                                    protected boolean localIsanonymous ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsanonymousTracker = false ;

                           public boolean isIsanonymousSpecified(){
                               return localIsanonymousTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsanonymous(){
                               return localIsanonymous;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Isanonymous
                               */
                               public void setIsanonymous(boolean param){
                            localIsanonymousTracker = true;
                                   
                                            this.localIsanonymous=param;
                                       

                               }
                            

                        /**
                        * field for Isapproved
                        */

                        
                                    protected boolean localIsapproved ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsapprovedTracker = false ;

                           public boolean isIsapprovedSpecified(){
                               return localIsapprovedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsapproved(){
                               return localIsapproved;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Isapproved
                               */
                               public void setIsapproved(boolean param){
                            localIsapprovedTracker = true;
                                   
                                            this.localIsapproved=param;
                                       

                               }
                            

                        /**
                        * field for Islockedout
                        */

                        
                                    protected boolean localIslockedout ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIslockedoutTracker = false ;

                           public boolean isIslockedoutSpecified(){
                               return localIslockedoutTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIslockedout(){
                               return localIslockedout;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Islockedout
                               */
                               public void setIslockedout(boolean param){
                            localIslockedoutTracker = true;
                                   
                                            this.localIslockedout=param;
                                       

                               }
                            

                        /**
                        * field for Isonline
                        */

                        
                                    protected java.lang.String localIsonline ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsonlineTracker = false ;

                           public boolean isIsonlineSpecified(){
                               return localIsonlineTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIsonline(){
                               return localIsonline;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Isonline
                               */
                               public void setIsonline(java.lang.String param){
                            localIsonlineTracker = true;
                                   
                                            this.localIsonline=param;
                                       

                               }
                            

                        /**
                        * field for Lastactivitydate
                        */

                        
                                    protected java.util.Calendar localLastactivitydate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastactivitydateTracker = false ;

                           public boolean isLastactivitydateSpecified(){
                               return localLastactivitydateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastactivitydate(){
                               return localLastactivitydate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Lastactivitydate
                               */
                               public void setLastactivitydate(java.util.Calendar param){
                            localLastactivitydateTracker = true;
                                   
                                            this.localLastactivitydate=param;
                                       

                               }
                            

                        /**
                        * field for Lastlockedoutdate
                        */

                        
                                    protected java.util.Calendar localLastlockedoutdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastlockedoutdateTracker = false ;

                           public boolean isLastlockedoutdateSpecified(){
                               return localLastlockedoutdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastlockedoutdate(){
                               return localLastlockedoutdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Lastlockedoutdate
                               */
                               public void setLastlockedoutdate(java.util.Calendar param){
                            localLastlockedoutdateTracker = true;
                                   
                                            this.localLastlockedoutdate=param;
                                       

                               }
                            

                        /**
                        * field for Lastlockoutdate
                        */

                        
                                    protected java.util.Calendar localLastlockoutdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastlockoutdateTracker = false ;

                           public boolean isLastlockoutdateSpecified(){
                               return localLastlockoutdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastlockoutdate(){
                               return localLastlockoutdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Lastlockoutdate
                               */
                               public void setLastlockoutdate(java.util.Calendar param){
                            localLastlockoutdateTracker = true;
                                   
                                            this.localLastlockoutdate=param;
                                       

                               }
                            

                        /**
                        * field for Lastlogindate
                        */

                        
                                    protected java.util.Calendar localLastlogindate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastlogindateTracker = false ;

                           public boolean isLastlogindateSpecified(){
                               return localLastlogindateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastlogindate(){
                               return localLastlogindate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Lastlogindate
                               */
                               public void setLastlogindate(java.util.Calendar param){
                            localLastlogindateTracker = true;
                                   
                                            this.localLastlogindate=param;
                                       

                               }
                            

                        /**
                        * field for Lastpasswordchangeddate
                        */

                        
                                    protected java.util.Calendar localLastpasswordchangeddate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastpasswordchangeddateTracker = false ;

                           public boolean isLastpasswordchangeddateSpecified(){
                               return localLastpasswordchangeddateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastpasswordchangeddate(){
                               return localLastpasswordchangeddate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Lastpasswordchangeddate
                               */
                               public void setLastpasswordchangeddate(java.util.Calendar param){
                            localLastpasswordchangeddateTracker = true;
                                   
                                            this.localLastpasswordchangeddate=param;
                                       

                               }
                            

                        /**
                        * field for Loweredemail
                        */

                        
                                    protected java.lang.String localLoweredemail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLoweredemailTracker = false ;

                           public boolean isLoweredemailSpecified(){
                               return localLoweredemailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLoweredemail(){
                               return localLoweredemail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Loweredemail
                               */
                               public void setLoweredemail(java.lang.String param){
                            localLoweredemailTracker = true;
                                   
                                            this.localLoweredemail=param;
                                       

                               }
                            

                        /**
                        * field for Mobilealias
                        */

                        
                                    protected java.lang.String localMobilealias ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMobilealiasTracker = false ;

                           public boolean isMobilealiasSpecified(){
                               return localMobilealiasTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMobilealias(){
                               return localMobilealias;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Mobilealias
                               */
                               public void setMobilealias(java.lang.String param){
                            localMobilealiasTracker = true;
                                   
                                            this.localMobilealias=param;
                                       

                               }
                            

                        /**
                        * field for Mobilepin
                        */

                        
                                    protected java.lang.String localMobilepin ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMobilepinTracker = false ;

                           public boolean isMobilepinSpecified(){
                               return localMobilepinTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMobilepin(){
                               return localMobilepin;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Mobilepin
                               */
                               public void setMobilepin(java.lang.String param){
                            localMobilepinTracker = true;
                                   
                                            this.localMobilepin=param;
                                       

                               }
                            

                        /**
                        * field for Modifydate
                        */

                        
                                    protected java.util.Calendar localModifydate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localModifydateTracker = false ;

                           public boolean isModifydateSpecified(){
                               return localModifydateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getModifydate(){
                               return localModifydate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Modifydate
                               */
                               public void setModifydate(java.util.Calendar param){
                            localModifydateTracker = true;
                                   
                                            this.localModifydate=param;
                                       

                               }
                            

                        /**
                        * field for Password
                        */

                        
                                    protected java.lang.String localPassword ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPasswordTracker = false ;

                           public boolean isPasswordSpecified(){
                               return localPasswordTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPassword(){
                               return localPassword;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Password
                               */
                               public void setPassword(java.lang.String param){
                            localPasswordTracker = true;
                                   
                                            this.localPassword=param;
                                       

                               }
                            

                        /**
                        * field for Question
                        */

                        
                                    protected java.lang.String localQuestion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQuestionTracker = false ;

                           public boolean isQuestionSpecified(){
                               return localQuestionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getQuestion(){
                               return localQuestion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Question
                               */
                               public void setQuestion(java.lang.String param){
                            localQuestionTracker = true;
                                   
                                            this.localQuestion=param;
                                       

                               }
                            

                        /**
                        * field for Userflag
                        */

                        
                                    protected java.lang.String localUserflag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserflagTracker = false ;

                           public boolean isUserflagSpecified(){
                               return localUserflagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserflag(){
                               return localUserflag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Userflag
                               */
                               public void setUserflag(java.lang.String param){
                            localUserflagTracker = true;
                                   
                                            this.localUserflag=param;
                                       

                               }
                            

                        /**
                        * field for Userid
                        */

                        
                                    protected int localUserid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUseridTracker = false ;

                           public boolean isUseridSpecified(){
                               return localUseridTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getUserid(){
                               return localUserid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Userid
                               */
                               public void setUserid(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localUseridTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localUserid=param;
                                       

                               }
                            

                        /**
                        * field for Username
                        */

                        
                                    protected java.lang.String localUsername ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsernameTracker = false ;

                           public boolean isUsernameSpecified(){
                               return localUsernameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUsername(){
                               return localUsername;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Username
                               */
                               public void setUsername(java.lang.String param){
                            localUsernameTracker = true;
                                   
                                            this.localUsername=param;
                                       

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this,parentQName));
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://entity.tonglbin.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":TbUser",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "TbUser",
                           xmlWriter);
                   }

               
                   }
                if (localAnswerTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "answer", xmlWriter);
                             

                                          if (localAnswer==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAnswer);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localApplicationnameTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "applicationname", xmlWriter);
                             

                                          if (localApplicationname==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localApplicationname);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCommentsTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "comments", xmlWriter);
                             

                                          if (localComments==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localComments);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreatedateTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "createdate", xmlWriter);
                             

                                          if (localCreatedate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmailTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "email", xmlWriter);
                             

                                          if (localEmail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFailedpasswordanswerattemptcountTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "failedpasswordanswerattemptcount", xmlWriter);
                             
                                               if (localFailedpasswordanswerattemptcount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("failedpasswordanswerattemptcount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFailedpasswordanswerattemptcount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFailedpasswordanswerattemptwindowstartTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "failedpasswordanswerattemptwindowstart", xmlWriter);
                             

                                          if (localFailedpasswordanswerattemptwindowstart==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFailedpasswordanswerattemptwindowstart));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFailedpasswordattemptcountTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "failedpasswordattemptcount", xmlWriter);
                             
                                               if (localFailedpasswordattemptcount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("failedpasswordattemptcount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFailedpasswordattemptcount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFailedpasswordattemptwindowstartTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "failedpasswordattemptwindowstart", xmlWriter);
                             

                                          if (localFailedpasswordattemptwindowstart==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFailedpasswordattemptwindowstart));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFieldTracker){
                             if (localField!=null) {
                                   namespace = "http://entity.tonglbin.org/xsd";
                                   for (int i = 0;i < localField.length;i++){
                                        
                                            if (localField[i] != null){
                                        
                                                writeStartElement(null, namespace, "field", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localField[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // write null attribute
                                                            namespace = "http://entity.tonglbin.org/xsd";
                                                            writeStartElement(null, namespace, "field", xmlWriter);
                                                            writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                            xmlWriter.writeEndElement();
                                                       
                                                }

                                   }
                             } else {
                                 
                                         // write the null attribute
                                        // write null attribute
                                           writeStartElement(null, "http://entity.tonglbin.org/xsd", "field", xmlWriter);

                                           // write the nil attribute
                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                           xmlWriter.writeEndElement();
                                    
                             }

                        } if (localIsanonymousTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "isanonymous", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsanonymous));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIsapprovedTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "isapproved", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsapproved));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIslockedoutTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "islockedout", xmlWriter);
                             
                                               if (false) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIslockedout));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIsonlineTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "isonline", xmlWriter);
                             

                                          if (localIsonline==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIsonline);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastactivitydateTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "lastactivitydate", xmlWriter);
                             

                                          if (localLastactivitydate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastactivitydate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastlockedoutdateTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "lastlockedoutdate", xmlWriter);
                             

                                          if (localLastlockedoutdate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastlockedoutdate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastlockoutdateTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "lastlockoutdate", xmlWriter);
                             

                                          if (localLastlockoutdate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastlockoutdate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastlogindateTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "lastlogindate", xmlWriter);
                             

                                          if (localLastlogindate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastlogindate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastpasswordchangeddateTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "lastpasswordchangeddate", xmlWriter);
                             

                                          if (localLastpasswordchangeddate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastpasswordchangeddate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLoweredemailTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "loweredemail", xmlWriter);
                             

                                          if (localLoweredemail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLoweredemail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMobilealiasTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "mobilealias", xmlWriter);
                             

                                          if (localMobilealias==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMobilealias);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMobilepinTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "mobilepin", xmlWriter);
                             

                                          if (localMobilepin==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMobilepin);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localModifydateTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "modifydate", xmlWriter);
                             

                                          if (localModifydate==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localModifydate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPasswordTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "password", xmlWriter);
                             

                                          if (localPassword==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPassword);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localQuestionTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "question", xmlWriter);
                             

                                          if (localQuestion==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localQuestion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserflagTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "userflag", xmlWriter);
                             

                                          if (localUserflag==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserflag);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUseridTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "userid", xmlWriter);
                             
                                               if (localUserid==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("userid cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserid));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUsernameTracker){
                                    namespace = "http://entity.tonglbin.org/xsd";
                                    writeStartElement(null, namespace, "username", xmlWriter);
                             

                                          if (localUsername==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUsername);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://entity.tonglbin.org/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace,attName,attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace,attName,attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static TbUser parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            TbUser object =
                new TbUser();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();
                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"TbUser".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (TbUser)org.tonglbin.entity.xsd.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","answer").equals(reader.getName()) || new javax.xml.namespace.QName("","answer").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAnswer(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","applicationname").equals(reader.getName()) || new javax.xml.namespace.QName("","applicationname").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setApplicationname(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","comments").equals(reader.getName()) || new javax.xml.namespace.QName("","comments").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setComments(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","createdate").equals(reader.getName()) || new javax.xml.namespace.QName("","createdate").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreatedate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","email").equals(reader.getName()) || new javax.xml.namespace.QName("","email").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","failedpasswordanswerattemptcount").equals(reader.getName()) || new javax.xml.namespace.QName("","failedpasswordanswerattemptcount").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"failedpasswordanswerattemptcount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFailedpasswordanswerattemptcount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setFailedpasswordanswerattemptcount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","failedpasswordanswerattemptwindowstart").equals(reader.getName()) || new javax.xml.namespace.QName("","failedpasswordanswerattemptwindowstart").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFailedpasswordanswerattemptwindowstart(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","failedpasswordattemptcount").equals(reader.getName()) || new javax.xml.namespace.QName("","failedpasswordattemptcount").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"failedpasswordattemptcount" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFailedpasswordattemptcount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setFailedpasswordattemptcount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","failedpasswordattemptwindowstart").equals(reader.getName()) || new javax.xml.namespace.QName("","failedpasswordattemptwindowstart").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFailedpasswordattemptwindowstart(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","field").equals(reader.getName()) || new javax.xml.namespace.QName("","field").equals(reader.getName()) ){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                    
                                              nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                              if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                  list10.add(null);
                                                       
                                                  reader.next();
                                              } else {
                                            list10.add(reader.getElementText());
                                            }
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone10 = false;
                                            while(!loopDone10){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone10 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","field").equals(reader.getName())){
                                                         
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list10.add(null);
                                                                   
                                                              reader.next();
                                                          } else {
                                                        list10.add(reader.getElementText());
                                                        }
                                                    }else{
                                                        loopDone10 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setField((java.lang.String[])
                                                        list10.toArray(new java.lang.String[list10.size()]));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","isanonymous").equals(reader.getName()) || new javax.xml.namespace.QName("","isanonymous").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsanonymous(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","isapproved").equals(reader.getName()) || new javax.xml.namespace.QName("","isapproved").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsapproved(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","islockedout").equals(reader.getName()) || new javax.xml.namespace.QName("","islockedout").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIslockedout(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","isonline").equals(reader.getName()) || new javax.xml.namespace.QName("","isonline").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsonline(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","lastactivitydate").equals(reader.getName()) || new javax.xml.namespace.QName("","lastactivitydate").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastactivitydate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","lastlockedoutdate").equals(reader.getName()) || new javax.xml.namespace.QName("","lastlockedoutdate").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastlockedoutdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","lastlockoutdate").equals(reader.getName()) || new javax.xml.namespace.QName("","lastlockoutdate").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastlockoutdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","lastlogindate").equals(reader.getName()) || new javax.xml.namespace.QName("","lastlogindate").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastlogindate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","lastpasswordchangeddate").equals(reader.getName()) || new javax.xml.namespace.QName("","lastpasswordchangeddate").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastpasswordchangeddate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","loweredemail").equals(reader.getName()) || new javax.xml.namespace.QName("","loweredemail").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLoweredemail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","mobilealias").equals(reader.getName()) || new javax.xml.namespace.QName("","mobilealias").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMobilealias(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","mobilepin").equals(reader.getName()) || new javax.xml.namespace.QName("","mobilepin").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMobilepin(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","modifydate").equals(reader.getName()) || new javax.xml.namespace.QName("","modifydate").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setModifydate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","password").equals(reader.getName()) || new javax.xml.namespace.QName("","password").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPassword(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","question").equals(reader.getName()) || new javax.xml.namespace.QName("","question").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setQuestion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","userflag").equals(reader.getName()) || new javax.xml.namespace.QName("","userflag").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserflag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","userid").equals(reader.getName()) || new javax.xml.namespace.QName("","userid").equals(reader.getName()) ){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"userid" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setUserid(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://entity.tonglbin.org/xsd","username").equals(reader.getName()) || new javax.xml.namespace.QName("","username").equals(reader.getName()) ){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUsername(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // 2 - A start element we are not expecting indicates a trailing invalid property
                                
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
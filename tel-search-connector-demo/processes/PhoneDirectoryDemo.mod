[Ivy]
17D132BFCF818781 9.3.0 #module
>Proto >Proto Collection #zClass
Po0 PhoneDirectoryDemo Big #zClass
Po0 B #cInfo
Po0 #process
Po0 @AnnotationInP-0n ai ai #zField
Po0 @TextInP .type .type #zField
Po0 @TextInP .processKind .processKind #zField
Po0 @TextInP .xml .xml #zField
Po0 @TextInP .responsibility .responsibility #zField
Po0 @StartRequest f0 '' #zField
Po0 @EndTask f1 '' #zField
Po0 @CallSub f3 '' #zField
Po0 @PushWFArc f4 '' #zField
Po0 @PushWFArc f2 '' #zField
>Proto Po0 Po0 PhoneDirectoryDemo #zField
Po0 f0 outLink start.ivp #txt
Po0 f0 inParamDecl '<> param;' #txt
Po0 f0 requestEnabled true #txt
Po0 f0 triggerEnabled false #txt
Po0 f0 callSignature start() #txt
Po0 f0 caseData businessCase.attach=true #txt
Po0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start.ivp</name>
    </language>
</elementInfo>
' #txt
Po0 f0 @C|.responsibility Everybody #txt
Po0 f0 81 49 30 30 -21 17 #rect
Po0 f1 337 49 30 30 0 15 #rect
Po0 f3 processCall PhoneDirectory:call() #txt
Po0 f3 requestActionDecl '<> param;' #txt
Po0 f3 responseMappingAction 'out=in;
' #txt
Po0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>PhoneDirectory</name>
    </language>
</elementInfo>
' #txt
Po0 f3 168 42 112 44 -42 -8 #rect
Po0 f4 111 64 168 64 #arcP
Po0 f2 280 64 337 64 #arcP
>Proto Po0 .type com.axonivy.connector.telsearch.tel.search.connector.demo.Data #txt
>Proto Po0 .processKind NORMAL #txt
>Proto Po0 0 0 32 24 18 0 #rect
>Proto Po0 @|BIcon #fIcon
Po0 f0 mainOut f4 tail #connect
Po0 f4 head f3 mainIn #connect
Po0 f3 mainOut f2 tail #connect
Po0 f2 head f1 mainIn #connect

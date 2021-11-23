[Ivy]
17D132BFCF818781 9.3.1 #module
>Proto >Proto Collection #zClass
Po0 PhoneDirectoryDemo Big #zClass
Po0 B #cInfo
Po0 #process
Po0 @AnnotationInP-0n ai ai #zField
Po0 @TextInP .type .type #zField
Po0 @TextInP .processKind .processKind #zField
Po0 @TextInP .xml .xml #zField
Po0 @TextInP .responsibility .responsibility #zField
Po0 @StartRequest f5 '' #zField
Po0 @EndTask f6 '' #zField
Po0 @UserDialog f8 '' #zField
Po0 @PushWFArc f9 '' #zField
Po0 @PushWFArc f7 '' #zField
Po0 @InfoButton f0 '' #zField
>Proto Po0 Po0 PhoneDirectoryDemo #zField
Po0 f5 outLink phoneDirectoryRequest.ivp #txt
Po0 f5 inParamDecl '<> param;' #txt
Po0 f5 requestEnabled true #txt
Po0 f5 triggerEnabled false #txt
Po0 f5 callSignature phoneDirectoryRequest() #txt
Po0 f5 caseData businessCase.attach=true #txt
Po0 f5 @CG|tags demo #txt
Po0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>phoneDirectoryRequest.ivp</name>
    </language>
</elementInfo>
' #txt
Po0 f5 @C|.responsibility Everybody #txt
Po0 f5 41 177 30 30 -24 17 #rect
Po0 f6 297 177 30 30 0 15 #rect
Po0 f8 dialogId com.axonivy.connector.telsearch.demo.AddressFinder #txt
Po0 f8 startMethod start() #txt
Po0 f8 requestActionDecl '<> param;' #txt
Po0 f8 responseMappingAction 'out=in;
' #txt
Po0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>AddressFinder</name>
    </language>
</elementInfo>
' #txt
Po0 f8 128 170 112 44 -40 -8 #rect
Po0 f9 71 192 128 192 #arcP
Po0 f7 240 192 297 192 #arcP
Po0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>This demo shows how easy you can retrieve phone directory entries using the tel.search.ch API.&#13;
To do so, you can enter a "what" (e.g. name or phone number) or a "where" (e.g. location or street) that will be passed&#13;
to the underlying PhoneDirectory subprocess in which the API request takes place.&#13;
&#13;
Note that you can use the API without a key, but the number of requests is limited.&#13;
An API key can be requested here: https://tel.search.ch/api/getkey. If you want to use your own API key,&#13;
you can simply add it to variables.yaml (tel.search.api.key).</name>
    </language>
</elementInfo>
' #txt
Po0 f0 32 18 640 124 -317 -56 #rect
>Proto Po0 .type com.axonivy.connector.telsearch.tel.search.connector.demo.Data #txt
>Proto Po0 .processKind NORMAL #txt
>Proto Po0 0 0 32 24 18 0 #rect
>Proto Po0 @|BIcon #fIcon
Po0 f5 mainOut f9 tail #connect
Po0 f9 head f8 mainIn #connect
Po0 f8 mainOut f7 tail #connect
Po0 f7 head f6 mainIn #connect

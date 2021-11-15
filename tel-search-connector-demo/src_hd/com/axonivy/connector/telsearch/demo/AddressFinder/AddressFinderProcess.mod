[Ivy]
17D14C4DFA5FA288 9.3.0 #module
>Proto >Proto Collection #zClass
As0 AddressFinderProcess Big #zClass
As0 RD #cInfo
As0 #process
As0 @AnnotationInP-0n ai ai #zField
As0 @TextInP .type .type #zField
As0 @TextInP .processKind .processKind #zField
As0 @TextInP .xml .xml #zField
As0 @TextInP .responsibility .responsibility #zField
As0 @UdInit f0 '' #zField
As0 @UdProcessEnd f1 '' #zField
As0 @PushWFArc f2 '' #zField
As0 @UdEvent f3 '' #zField
As0 @UdExitEnd f4 '' #zField
As0 @PushWFArc f5 '' #zField
As0 @UdEvent f6 '' #zField
As0 @UdProcessEnd f7 '' #zField
As0 @CallSub f9 '' #zField
As0 @PushWFArc f10 '' #zField
As0 @PushWFArc f8 '' #zField
>Proto As0 As0 AddressFinderProcess #zField
As0 f0 guid 17D14C4DFA9C8F10 #txt
As0 f0 method start() #txt
As0 f0 inParameterDecl '<> param;' #txt
As0 f0 inParameterMapAction 'out.matches=[];
' #txt
As0 f0 outParameterDecl '<> result;' #txt
As0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
As0 f0 83 51 26 26 -16 15 #rect
As0 f1 211 51 26 26 0 12 #rect
As0 f2 109 64 211 64 #arcP
As0 f3 guid 17D14C4DFAD333CD #txt
As0 f3 actionTable 'out=in;
' #txt
As0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
As0 f3 83 147 26 26 -15 15 #rect
As0 f4 211 147 26 26 0 12 #rect
As0 f5 109 160 211 160 #arcP
As0 f6 guid 17D14D58C9D38665 #txt
As0 f6 actionTable 'out=in;
' #txt
As0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>find</name>
    </language>
</elementInfo>
' #txt
As0 f6 83 211 26 26 -10 15 #rect
As0 f7 339 211 26 26 0 12 #rect
As0 f9 processCall PhoneDirectory:search(String) #txt
As0 f9 requestActionDecl '<String what> param;' #txt
As0 f9 requestMappingAction 'param.what=in.search;
' #txt
As0 f9 responseMappingAction 'out=in;
out.matches=result.matches;
out.search="";
' #txt
As0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>PhoneDirectory</name>
    </language>
</elementInfo>
' #txt
As0 f9 168 202 112 44 -42 -8 #rect
As0 f10 109 224 168 224 #arcP
As0 f8 280 224 339 224 #arcP
>Proto As0 .type com.axonivy.connector.telsearch.demo.AddressFinder.AddressFinderData #txt
>Proto As0 .processKind HTML_DIALOG #txt
>Proto As0 -8 -8 16 16 16 26 #rect
As0 f0 mainOut f2 tail #connect
As0 f2 head f1 mainIn #connect
As0 f3 mainOut f5 tail #connect
As0 f5 head f4 mainIn #connect
As0 f6 mainOut f10 tail #connect
As0 f10 head f9 mainIn #connect
As0 f9 mainOut f8 tail #connect
As0 f8 head f7 mainIn #connect

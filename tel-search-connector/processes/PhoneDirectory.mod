[Ivy]
17D13296818E1620 9.3.0 #module
>Proto >Proto Collection #zClass
Py0 PhoneDirectory Big #zClass
Py0 B #cInfo
Py0 #process
Py0 @AnnotationInP-0n ai ai #zField
Py0 @TextInP .type .type #zField
Py0 @TextInP .processKind .processKind #zField
Py0 @TextInP .xml .xml #zField
Py0 @TextInP .responsibility .responsibility #zField
Py0 @StartSub f0 '' #zField
Py0 @EndSub f1 '' #zField
Py0 @RestClientCall f3 '' #zField
Py0 @PushWFArc f4 '' #zField
Py0 @PushWFArc f2 '' #zField
>Proto Py0 Py0 PhoneDirectory #zField
Py0 f0 inParamDecl '<String what> param;' #txt
Py0 f0 inParamInfo 'what.description=name or phone number' #txt
Py0 f0 inParamTable 'out.what=param.what;
' #txt
Py0 f0 outParamDecl '<java.util.List<String> matches> result;' #txt
Py0 f0 outParamTable 'result.matches=in.matches;
' #txt
Py0 f0 callSignature search(String) #txt
Py0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>search(String)</name>
    </language>
</elementInfo>
' #txt
Py0 f0 81 49 30 30 -13 17 #rect
Py0 f1 337 49 30 30 0 15 #rect
Py0 f3 clientId 20621516-9434-437b-8a8d-d41da2e7917b #txt
Py0 f3 queryParams 'was=in.what;
' #txt
Py0 f3 resultType cz.jirutka.atom.jaxb.Feed #txt
Py0 f3 responseCode 'import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;
import cz.jirutka.atom.jaxb.Entry;

ivy.log.debug(result);

for(Entry entry : result.entries){
	ElementNSImpl element = entry.content as ElementNSImpl;
	out.matches.add(element.getTextContent());	
}' #txt
Py0 f3 clientErrorCode ivy:error:rest:client #txt
Py0 f3 statusErrorCode ivy:error:rest:client #txt
Py0 f3 168 42 112 44 0 -8 #rect
Py0 f4 111 64 168 64 #arcP
Py0 f2 280 64 337 64 #arcP
>Proto Py0 .type com.axonivy.connector.telsearch.tel.search.connector.PhoneDirectoryData #txt
>Proto Py0 .processKind CALLABLE_SUB #txt
>Proto Py0 0 0 32 24 18 0 #rect
>Proto Py0 @|BIcon #fIcon
Py0 f0 mainOut f4 tail #connect
Py0 f4 head f3 mainIn #connect
Py0 f3 mainOut f2 tail #connect
Py0 f2 head f1 mainIn #connect

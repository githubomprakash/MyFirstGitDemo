package retryLogic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformerListner implements IAnnotationTransformer {
	
     public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor,Method testMethod)
    
    
    {
        annotation.setRetryAnalyzer(retryLogic.RetryLogic.class);
        
        
    }
    
    

}

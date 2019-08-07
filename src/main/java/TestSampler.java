import org.apache.jmeter.samplers.AbstractSampler;
import org.apache.jmeter.samplers.Entry;
import org.apache.jmeter.samplers.SampleResult;

/**
 * @Author: Rong.Li
 * @Date: 2019/8/5 11:29
 * @Description:
 */
public class TestSampler extends AbstractSampler {
    public final static String FUNCTION = "function";

    @Override
    public void removed() {

    }

    @Override
    public SampleResult sample(Entry entry) {
        SampleResult res = new SampleResult();
        res.sampleStart();
        System.out.println(this.getProperty(FUNCTION));//输出GUI界面所输入的函数方法返回结果
        res.sampleEnd();
        res.setSuccessful(true);
        res.setResponseData(this.getProperty(FUNCTION).toString(),"UTF-8");
        res.setResultFileName(this.getClass().getSimpleName());
        return res;
    }
}

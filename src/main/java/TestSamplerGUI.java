import org.apache.jmeter.samplers.gui.AbstractSamplerGui;
import org.apache.jmeter.testelement.TestElement;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Rong.Li
 * @Date: 2019/8/5 16:52
 * @Description:
 */
public class TestSamplerGUI extends AbstractSamplerGui {
    private JTextField functionTextField = null;
    private void init() {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        functionTextField = new JTextField(20);
        mainPanel.add(functionTextField);
        add(mainPanel);
    }
    public TestSamplerGUI(){
        init();
    }

    @Override
    public String getLabelResource() {
        return this.getClass().getSimpleName();
    }

    @Override
    public TestElement createTestElement() {
        TestElement sampler = new TestSampler();
        modifyTestElement(sampler);
        return sampler;
    }

    @Override
    public void modifyTestElement(TestElement sampler) {
        super.configureTestElement(sampler);
        if (sampler instanceof TestSampler) {
            TestSampler testSmpler = (TestSampler) sampler;
            testSmpler.setProperty(TestSampler.FUNCTION, functionTextField.getText());      }

    }

    @Override
    public String getStaticLabel() {//设置显示名称
        // TODO Auto-generated method stub
        return this.getClass().getSimpleName();
    }
}

public class BMI 
{
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    private String[] Interpretation = { "Underweight", "Normal weight", "Overweight", "Obese" };

    public BMI(String name, int age, double weight, double feet, double inches) 
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public double getBMI() 
    {
        double height = (feet * 12 + inches) * 0.0254;
        double bmi = weight / (height * height);
        return bmi;
    }

    public String getInterpretation() 
    {
        double BMI_VALUE = getBMI();
        if (BMI_VALUE < 18.5)
        {
            return Interpretation[0];
        }
        
        else if (BMI_VALUE >= 18.5 && BMI_VALUE < 25.0)
        {
            return Interpretation[1];
        }
          
        else if (BMI_VALUE >= 25.0 && BMI_VALUE < 30.0)
        {
            return Interpretation[2];
        }

        else
        {
            return Interpretation[3];
        }
    }

    public String getName() 
    {
        return name;
    }

    public double getHeight()
    {
        return inches + feet * 12.0 * 0.0254;
    }

    public double getWeight() 
    {
        return weight;
    }

    public int getAge()
    {
        return age;
    }
}
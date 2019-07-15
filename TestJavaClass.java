public class TestJavaClass {

	public static void main(String[] args) {
		// the theta vector used here was output of a train process
		double[] thetaVector = new double[] { 1.004579, 5.286822 };
		LinearRegressionFunction targetFunction = new LinearRegressionFunction(thetaVector);

		// create the feature vector function with x0=1 (for computational reasons) and x1=house-size
		Double[] featureVector = new Double[] { 1.0, 1330.0 };

		// make the prediction
		double predictedPrice = targetFunction.apply(featureVector);
		
		System.out.println("Predicted price : "+predictedPrice+"\n Theta is : "+targetFunction.getThetas()[0]);
	}
}

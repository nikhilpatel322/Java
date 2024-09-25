import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnhancedHealthcareChatbot {
    private Map<String, String> responses;

    public EnhancedHealthcareChatbot() {
        responses = new HashMap<>();
        
        // General Health Questions
        responses.put("what are the symptoms of a cold", "Common symptoms include a runny nose, sore throat, cough, and fatigue.");
        responses.put("how can I prevent the flu", "Getting vaccinated annually, practicing good hand hygiene, and avoiding close contact with sick individuals can help.");
        responses.put("what should I do if I have a headache", "Try resting in a quiet room, staying hydrated, and taking over-the-counter pain relief if needed.");
        responses.put("when should I see a doctor", "If your symptoms persist, worsen, or are accompanied by severe pain, it's best to consult a doctor.");
        responses.put("what is the recommended daily water intake", "The general recommendation is about 8 cups (2 liters) of water per day, but it can vary based on activity level and climate.");

        // Chronic Conditions
        responses.put("what are the signs of diabetes", "Increased thirst, frequent urination, extreme fatigue, and blurred vision can be signs of diabetes.");
        responses.put("how can I manage my asthma", "Avoid triggers, use prescribed medications, and develop an action plan with your doctor.");
        responses.put("what is hypertension and how can it be treated", "Hypertension, or high blood pressure, can often be managed through lifestyle changes and medications.");
        responses.put("what lifestyle changes can help with arthritis", "Maintaining a healthy weight, regular exercise, and physical therapy can help manage arthritis symptoms.");
        responses.put("how can I control my cholesterol levels", "A healthy diet low in saturated fats, regular exercise, and medications as prescribed can help control cholesterol.");

        // Nutrition and Diet
        responses.put("what are the benefits of a balanced diet", "A balanced diet provides essential nutrients, helps maintain a healthy weight, and reduces the risk of chronic diseases.");
        responses.put("how much protein do I need daily", "The recommended daily intake is about 0.8 grams of protein per kilogram of body weight.");
        responses.put("what foods should I avoid if I have high blood pressure", "Reduce intake of salt, processed foods, and high-fat foods.");
        responses.put("how can I lose weight healthily", "Focus on a balanced diet, regular exercise, and portion control.");
        responses.put("what are superfoods and why are they important", "Superfoods are nutrient-rich foods considered to be especially beneficial for health and well-being.");

        // Mental Health
        responses.put("what are the signs of depression", "Signs include persistent sadness, loss of interest in activities, changes in appetite, and fatigue.");
        responses.put("how can I manage anxiety", "Practicing relaxation techniques, seeking therapy, and avoiding caffeine can help manage anxiety.");
        responses.put("what should I do if I’m feeling overwhelmed", "Take a break, talk to someone, and practice stress-relief techniques like deep breathing.");
        responses.put("what are the benefits of meditation", "Meditation can reduce stress, improve focus, and promote emotional health.");
        responses.put("how can I improve my sleep quality", "Establishing a regular sleep schedule, creating a restful environment, and limiting screen time before bed can help.");

        // Children’s Health
        responses.put("what vaccinations do children need", "Children need vaccinations for diseases like measles, mumps, rubella, and polio.");
        responses.put("how can I tell if my child is sick", "Look for signs like a high fever, unusual irritability, or changes in appetite.");
        responses.put("what are the signs of ADHD", "Signs can include inattention, hyperactivity, and impulsive behavior.");
        responses.put("how can I support my child's mental health", "Encourage open communication, provide a stable environment, and seek professional help if needed.");
        responses.put("what should I do if my child has a fever", "Monitor their temperature, ensure they stay hydrated, and seek medical advice if necessary.");

        // Elderly Care
        responses.put("what are the common health issues in seniors", "Common issues include arthritis, heart disease, diabetes, and cognitive decline.");
        responses.put("how can I help an elderly person with mobility issues", "Consider home modifications, assistive devices, and regular exercise.");
        responses.put("what are the signs of dementia", "Signs include memory loss, confusion, and difficulty completing familiar tasks.");
        responses.put("how can I ensure proper nutrition for older adults", "Focus on nutrient-dense foods and encourage hydration.");
        responses.put("what resources are available for caregivers", "Local support groups, online resources, and respite care services can provide assistance.");

        // Women's Health
        responses.put("what are the symptoms of pregnancy", "Common symptoms include missed periods, nausea, and breast tenderness.");
        responses.put("how can I manage menopause symptoms", "Lifestyle changes, hormone therapy, and regular check-ups can help manage symptoms.");
        responses.put("what screenings should women have regularly", "Women should have regular screenings for breast and cervical cancer, as well as blood pressure and cholesterol checks.");
        responses.put("how can I maintain reproductive health", "Regular check-ups, safe sex practices, and maintaining a healthy lifestyle are important.");
        responses.put("what are the risks of hormonal birth control", "Risks can include blood clots, mood changes, and weight gain.");

        // Men's Health
        responses.put("what are the symptoms of prostate issues", "Symptoms can include frequent urination, pain during urination, and difficulty starting urination.");
        responses.put("how can I improve my sexual health", "Maintain a healthy lifestyle, manage stress, and consult a healthcare provider for concerns.");
        responses.put("what screenings should men have regularly", "Men should have regular screenings for prostate cancer, cholesterol, and blood pressure.");
        responses.put("what are the risks of high testosterone levels", "Risks can include sleep apnea, acne, and increased risk of heart disease.");
        responses.put("how can I manage stress effectively", "Regular exercise, meditation, and talking to someone can help manage stress.");

        // Emergency Situations
        responses.put("what should I do in case of a heart attack", "Call emergency services immediately and chew an aspirin if not allergic.");
        responses.put("how can I treat a burn at home", "Run cool water over the burn and cover it with a sterile bandage.");
        responses.put("what are the steps for CPR", "Check responsiveness, call for help, and begin chest compressions followed by rescue breaths.");
        responses.put("when should I go to the emergency room", "Go if you experience severe pain, difficulty breathing, or symptoms of a stroke.");
        responses.put("what should I do if someone is choking", "Encourage them to cough or perform the Heimlich maneuver if they can't breathe.");

        // Add more healthcare-related questions here as needed...
        // For brevity, I've included a selection of questions. You can expand this as needed.
    }

    public String getResponse(String userInput) {
        // Normalize input to lower case for matching
        userInput = userInput.toLowerCase();

        // Check if user input contains keywords
        for (String key : responses.keySet()) {
            if (userInput.contains(key)) {
                return responses.get(key);
            }
        }

        return "I'm sorry, I didn't understand that. Can you please ask something else?";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnhancedHealthcareChatbot chatbot = new EnhancedHealthcareChatbot();
        System.out.println("Welcome to HealthBot! How can I assist you today?");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit") || userInput.equalsIgnoreCase("quit")) {
                System.out.println("HealthBot: Thank you for chatting! Have a great day!");
                break;
            }

            String response = chatbot.getResponse(userInput);
            System.out.println("HealthBot: " + response);
        }

        scanner.close();
    }
}

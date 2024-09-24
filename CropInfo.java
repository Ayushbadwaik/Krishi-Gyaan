import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class CropInfo {
    private static HashMap<String, String> cropData = new HashMap<>();
    
    static {
        cropData.put("Video Links", "TOP YOUTUBE CHANNELS FOR LEARNING AGRICULTURE LESSONS\n" +
    "\n" +
    "1. https://www.youtube.com/@Farmizen\n" +
    "2. https://www.youtube.com/@KrishiHelpline\n" +
    "3. https://www.youtube.com/@TheAdvanceAgriculture\n" +
    "4. https://www.youtube.com/@bhartiyakisan\n");

cropData.put("Wheat", "Wheat is a staple food crop, high in carbohydrates.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and leveling.\n" +
    "2. Sow seeds in rows during October-November.\n" +
    "3. Provide irrigation as required.\n" +
    "4. Fertilize with nitrogen and phosphorus.\n" +
    "5. Control weeds and pests.\n" +
    "6. Harvest in March-April when grains are golden.\n" +
    "Pesticide: Mancozeb");

cropData.put("Rice", "Rice is a vital food crop, especially in Asia.\n" +
    "Steps to grow:\n" +
    "1. Prepare the land by puddling and leveling.\n" +
    "2. Transplant seedlings during June-July.\n" +
    "3. Maintain standing water in fields.\n" +
    "4. Fertilize with nitrogen and potash.\n" +
    "5. Monitor for pests and diseases.\n" +
    "6. Harvest in September-October when grains are hard.\n" +
    "Pesticide: Carbofuran");

cropData.put("Cotton", "Cotton is a fiber crop used for textiles.\n" +
    "Steps to grow:\n" +
    "1. Prepare the field by plowing and harrowing.\n" +
    "2. Sow seeds in rows during April-May.\n" +
    "3. Provide adequate irrigation.\n" +
    "4. Fertilize with nitrogen and phosphorus.\n" +
    "5. Monitor for pests like boll weevils.\n" +
    "6. Harvest in October-November when bolls burst.\n" +
    "Pesticide: Bacillus thuringiensis");

cropData.put("Barley", "Barley is a versatile cereal grain used for animal feed and brewing.\n" +
    "Steps to grow:\n" +
    "1. Prepare the land by plowing and leveling.\n" +
    "2. Sow seeds in rows during September-October.\n" +
    "3. Ensure adequate irrigation.\n" +
    "4. Fertilize with nitrogen and phosphorus.\n" +
    "5. Monitor for pests and diseases.\n" +
    "6. Harvest in June-July when grains are hard.\n" +
    "Pesticide: Chlorpyrifos");

cropData.put("Sugarcane", "Sugarcane is used for producing sugar and ethanol.\n" +
    "Steps to grow:\n" +
    "1. Prepare the field by plowing and leveling.\n" +
    "2. Plant sets in furrows during February-March.\n" +
    "3. Maintain irrigation, especially during dry periods.\n" +
    "4. Fertilize with nitrogen, phosphorus, and potassium.\n" +
    "5. Monitor for pests and diseases.\n" +
    "6. Harvest after 12-16 months when canes are mature.\n" +
    "Pesticide: Imidacloprid");

cropData.put("Maize (Corn)", "Maize is used for food and animal feed.\n" +
    "Steps to grow:\n" +
    "1. Prepare the land by plowing and tilling.\n" +
    "2. Sow seeds in rows during April-May.\n" +
    "3. Provide irrigation as needed.\n" +
    "4. Fertilize with nitrogen and potassium.\n" +
    "5. Control weeds and monitor for pests.\n" +
    "6. Harvest in August-September when kernels are mature.\n" +
    "Pesticide: Glyphosate");

cropData.put("Soybean", "Soybean is a high-protein crop used for food and oil.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and tilling.\n" +
    "2. Sow seeds in rows during May-June.\n" +
    "3. Maintain adequate moisture.\n" +
    "4. Fertilize with nitrogen and phosphorus.\n" +
    "5. Monitor for pests and diseases.\n" +
    "6. Harvest in September-October when pods are dry.\n" +
    "Pesticide: Flumioxazin");

cropData.put("Potato", "Potato is a staple vegetable and a major food source.\n" +
    "Steps to grow:\n" +
    "1. Prepare the land by tilling and adding organic matter.\n" +
    "2. Plant seed potatoes in rows during March-April.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Hill soil around plants as they grow.\n" +
    "5. Monitor for pests and diseases.\n" +
    "6. Harvest in August-September when tubers are mature.\n" +
    "Pesticide: Azadirachtin");

cropData.put("Tomato", "Tomato is a popular vegetable used in many cuisines.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil with compost and fertilizers.\n" +
    "2. Sow seeds indoors and transplant in April-May.\n" +
    "3. Maintain soil moisture and temperature.\n" +
    "4. Support plants with stakes or cages.\n" +
    "5. Monitor for pests and diseases.\n" +
    "6. Harvest when fruits are ripe and firm.\n" +
    "Pesticide: Thiomethoxam");

cropData.put("Onion", "Onion is a widely used vegetable known for its flavor.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and adding organic matter.\n" +
    "2. Sow seeds or sets in rows during February-March.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Control weeds and pests.\n" +
    "5. Harvest when tops fall and bulbs are dry.\n" +
    "Pesticide: Captan");

cropData.put("Carrot", "Carrot is a root vegetable rich in vitamins.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain consistent moisture.\n" +
    "4. Thin seedlings as they grow.\n" +
    "5. Monitor for pests and diseases.\n" +
    "6. Harvest when roots are mature and tender.\n" +
    "Pesticide: Chlorantraniliprole");

cropData.put("Garlic", "Garlic is a bulbous plant used for flavoring.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Plant cloves in rows during October-November.\n" +
    "3. Maintain soil moisture and drainage.\n" +
    "4. Fertilize with nitrogen and phosphorus.\n" +
    "5. Monitor for pests and diseases.\n" +
    "6. Harvest when leaves turn yellow and dry.\n" +
    "Pesticide: Methomyl");

cropData.put("Cabbage", "Cabbage is a leafy vegetable rich in nutrients.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil with compost and fertilizers.\n" +
    "2. Sow seeds indoors and transplant in March-April.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when heads are firm and tight.\n" +
    "Pesticide: Malathion");

cropData.put("Cauliflower", "Cauliflower is a cruciferous vegetable rich in vitamins.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by adding organic matter.\n" +
    "2. Sow seeds indoors and transplant in April-May.\n" +
    "3. Maintain consistent moisture.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when heads are firm and white.\n" +
    "Pesticide: Lambda-cyhalothrin");

cropData.put("Spinach", "Spinach is a leafy green vegetable known for its health benefits.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding compost.\n" +
    "2. Sow seeds in rows during September-October.\n" +
    "3. Maintain soil moisture.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest leaves when young and tender.\n" +
    "Pesticide: Spinosad");

cropData.put("Lettuce", "Lettuce is a leafy vegetable commonly used in salads.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil with compost and fertilizers.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain consistent moisture.\n" +
    "4. Thin seedlings as they grow.\n" +
    "5. Harvest leaves when they are young and crisp.\n" +
    "Pesticide: Acetamiprid");

cropData.put("Peas", "Peas are a cool-season crop rich in protein.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Provide support for climbing varieties.\n" +
    "5. Harvest when pods are plump and tender.\n" +
    "Pesticide: Fipronil");

cropData.put("Beans", "Beans are a protein-rich legume used in various dishes.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding compost.\n" +
    "2. Sow seeds in rows during April-May.\n" +
    "3. Maintain soil moisture.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when pods are dry and seeds are hard.\n" +
    "Pesticide: Trichoderma");

cropData.put("Chickpeas", "Chickpeas are a high-protein legume used in many cuisines.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when pods are dry and seeds are hard.\n" +
    "Pesticide: Pyrethrins");

cropData.put("Lentils", "Lentils are a nutritious legume rich in protein and fiber.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding compost.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain soil moisture.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when pods are dry and seeds are hard.\n" +
    "Pesticide: Neem oil");

cropData.put("Millet", "Millet is a drought-resistant cereal grain used as food and fodder.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and leveling.\n" +
    "2. Sow seeds in rows during May-June.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when grains are mature.\n" +
    "Pesticide: Endosulfan");

cropData.put("Sorghum", "Sorghum is a drought-resistant cereal grain used for food and feed.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and leveling.\n" +
    "2. Sow seeds in rows during May-June.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when grains are mature.\n" +
    "Pesticide: Thiamethoxam");

cropData.put("Oats", "Oats are a cereal grain known for their health benefits.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and leveling.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain soil moisture.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when grains are mature.\n" +
    "Pesticide: Lambda-cyhalothrin");

cropData.put("Rye", "Rye is a cereal grain used for food and fodder.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and leveling.\n" +
    "2. Sow seeds in rows during September-October.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when grains are mature.\n" +
    "Pesticide: Hexazinone");

cropData.put("Quinoa", "Quinoa is a nutritious grain used for food and health products.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and adding organic matter.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain soil moisture.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when seeds are mature and dry.\n" +
    "Pesticide: Pyrethrins");

cropData.put("Cassava", "Cassava is a root vegetable rich in carbohydrates.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and leveling.\n" +
    "2. Plant cuttings in rows during March-April.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when roots are mature.\n" +
    "Pesticide: Avermectin");

cropData.put("Groundnut (Peanut)", "Groundnut is a legume used for food and oil.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and leveling.\n" +
    "2. Sow seeds in rows during May-June.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when pods are mature and leaves yellow.\n" +
    "Pesticide: Thiamethoxam");

cropData.put("Sunflower", "Sunflower is grown for its seeds and oil.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and leveling.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when heads are drooping and seeds are hard.\n" +
    "Pesticide: Fenpropathrin");

cropData.put("Mustard", "Mustard is grown for its seeds and oil.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and leveling.\n" +
    "2. Sow seeds in rows during October-November.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when pods are dry and seeds rattle.\n" +
    "Pesticide: Imidacloprid");

cropData.put("Flaxseed", "Flaxseed is grown for its oil and fibers.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by plowing and leveling.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when seed capsules are dry.\n" +
    "Pesticide: Pyrethrins");

cropData.put("Coconut", "Coconut is grown for its water, milk, and oil.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by clearing and leveling.\n" +
    "2. Plant seedlings in pits during May-June.\n" +
    "3. Maintain adequate moisture and drainage.\n" +
    "4. Fertilize with organic manure.\n" +
    "5. Monitor for pests and diseases.\n" +
    "6. Harvest coconuts after 6-7 months.\n" +
    "Pesticide: Triazophos");

cropData.put("Palm Oil", "Palm oil is derived from the fruit of the oil palm tree.\n" +
    "Steps to grow:\n" +
    "1. Prepare the land by clearing and leveling.\n" +
    "2. Plant seedlings during the rainy season.\n" +
    "3. Maintain adequate moisture and fertilization.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest fruits after 2-3 years of planting.\n" +
    "Pesticide: Glyphosate");

cropData.put("Taro", "Taro is a root vegetable rich in nutrients.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Plant corms in rows during April-May.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when leaves yellow and corms are mature.\n" +
    "Pesticide: Abamectin");

cropData.put("Sweet Potato", "Sweet potato is a nutritious root vegetable rich in vitamins.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Plant slips in rows during May-June.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when roots are mature and skin is firm.\n" +
    "Pesticide: Spinosad");

cropData.put("Zucchini", "Zucchini is a summer squash used in various dishes.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds in rows during April-May.\n" +
    "3. Maintain soil moisture.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when fruits are young and tender.\n" +
    "Pesticide: Chlorantraniliprole");

cropData.put("Pumpkin", "Pumpkin is a versatile vegetable used in cooking and decoration.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds in rows during May-June.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when fruits are orange and firm.\n" +
    "Pesticide: Cypermethrin");

cropData.put("Bell Pepper", "Bell pepper is a nutritious vegetable used in various dishes.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds indoors during February-March and transplant after frost.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when fruits are fully colored.\n" +
    "Pesticide: Abamectin");

cropData.put("Chili Pepper", "Chili pepper is used in many cuisines for its heat.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds indoors during February-March and transplant after frost.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when fruits are fully colored.\n" +
    "Pesticide: Bifenthrin");

cropData.put("Eggplant (Brinjal)", "Eggplant is a versatile vegetable used in various dishes.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds indoors during February-March and transplant after frost.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when fruits are glossy and firm.\n" +
    "Pesticide: Spinetoram");

cropData.put("Okra", "Okra is a nutritious vegetable used in many cuisines.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds in rows during April-May.\n" +
    "3. Maintain soil moisture and fertility.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when pods are young and tender.\n" +
    "Pesticide: Acetamiprid");

cropData.put("Radish", "Radish is a fast-growing root vegetable used in salads and cooking.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain soil moisture.\n" +
    "4. Thin seedlings as they grow.\n" +
    "5. Harvest when roots are young and crisp.\n" +
    "Pesticide: Acetamiprid");

cropData.put("Beetroot", "Beetroot is a nutritious root vegetable used in salads and juices.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding compost.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain soil moisture.\n" +
    "4. Thin seedlings as they grow.\n" +
    "5. Harvest when roots are young and tender.\n" +
    "Pesticide: Acetamiprid");

cropData.put("Turnip", "Turnip is a root vegetable used in soups and stews.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Sow seeds in rows during March-April.\n" +
    "3. Maintain soil moisture.\n" +
    "4. Thin seedlings as they grow.\n" +
    "5. Harvest when roots are young and tender.\n" +
    "Pesticide: Acetamiprid");

cropData.put("Avocado", "Avocado is a nutrient-rich fruit known for its healthy fats.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Plant seeds or seedlings in a sunny location.\n" +
    "3. Maintain soil moisture and drainage.\n" +
    "4. Fertilize with organic manure.\n" +
    "5. Harvest when fruits are ripe and creamy.\n" +
    "Pesticide: Imidacloprid");

cropData.put("Pineapple", "Pineapple is a tropical fruit known for its sweetness.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Plant crowns or suckers in a sunny location.\n" +
    "3. Maintain soil moisture and drainage.\n" +
    "4. Fertilize with organic manure.\n" +
    "5. Harvest when fruits are ripe and golden.\n" +
    "Pesticide: Trichoderma");

cropData.put("Mango", "Mango is a tropical fruit known for its sweetness.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Plant seeds or seedlings in a sunny location.\n" +
    "3. Maintain soil moisture and drainage.\n" +
    "4. Fertilize with organic manure.\n" +
    "5. Harvest when fruits are ripe and fragrant.\n" +
    "Pesticide: Triazophos");

cropData.put("Banana", "Banana is a tropical fruit rich in potassium and fiber.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Plant suckers in a sunny location.\n" +
    "3. Maintain soil moisture and drainage.\n" +
    "4. Fertilize with organic manure.\n" +
    "5. Harvest when fruits are ripe and yellow.\n" +
    "Pesticide: Imidacloprid");

cropData.put("Grapes", "Grapes are a sweet fruit used for eating and wine-making.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Plant vines in rows during spring.\n" +
    "3. Maintain soil moisture and provide support.\n" +
    "4. Monitor for pests and diseases.\n" +
    "5. Harvest when grapes are sweet and juicy.\n" +
    "Pesticide: Sulfur");

cropData.put("Papaya", "Papaya is a tropical fruit known for its sweetness and digestive benefits.\n" +
    "Steps to grow:\n" +
    "1. Prepare the soil by tilling and adding organic matter.\n" +
    "2. Plant seeds or seedlings in a sunny location.\n" +
    "3. Maintain soil moisture and drainage.\n" +
    "4. Fertilize with organic manure.\n" +
    "5. Harvest when fruits are ripe and soft.\n" +
    "Pesticide: Bacillus thuringiensis");
// Generate a 3-page document from the crop data
StringBuilder document = new StringBuilder();

document.append("Agriculture Knowledge-Based App\n\n");
document.append("Crop Information\n\n");

for (Map.Entry<String, String> entry : cropData.entrySet()) {
    document.append("Crop: ").append(entry.getKey()).append("\n");
    document.append("Details: ").append(entry.getValue()).append("\n\n");
}

// Ensure the document has at least 3 pages worth of content
String[] paragraphs = document.toString().split("\n\n");
int targetParagraphs = 20; // Approximation of paragraphs per page

if (paragraphs.length < targetParagraphs) {
    int additionalContent = targetParagraphs - paragraphs.length;
    document.append("\n\n").append("Additional Information:\n");
    for (int i = 0; i < additionalContent; i++) {
        document.append("This is additional information for page ").append(i + 1).append(".\n");
    }
}

// Print the document content
System.out.println(document.toString());

    }

    public static String getInfo(String crop) {
        return cropData.get(crop);
    }
}

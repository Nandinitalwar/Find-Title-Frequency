# Find-Title-Frequency
Using this Wikipedia dataset, write code to answer the following question: what are the 10 most commonly used words in the article headers? The headers of the headers are surrounded by two equal signs: == For example: ==Personnel==   You may implement your solution in the language of your choice. 

Output on running FindTitleFrequencyTester class:

See also
Results
References
Alpine skiing
Further reading
Licensing
History
External links
Sources
Track listing

# Instructions on running the Java code:

1) Open the file "FindTitleFrequencyTester.java" and replace "practice.txt" with the name of the file you are running code on
2) Using Codio or Terminal on an operating system of your choice, compile the files "FindTitleFrequency" and "FindTitleFrequencyTester" in the command line using the command 'javac [FileName].java'
3) Run FindTitleFrequencyTester by typing 'java [FileName]' to receive output

# Inspiration:

When first assigned to find the titles between these characters ("=="), I was confident I would be able to accomplish it as I had extracted text between a pair of delimeters before. However, the challenge was to find the top 10 most common titles, and I was excited to do that. The data structure that instantly came to mind was a HashMap, as I could associate the number of times a title had occured to 

# What it does:

Finds the 10 most commonly used words in the article headers. The headers of the headers are surrounded by two equal signs: == For example: ==Egghead==

# How I built it:

Using Java. I used LinkedLists, a HashSet, a HashMap, and a StringBuilder.

# Challenges I ran into:

-Obtaining the Key from the Value in HashMaps
I thought about this long and hard, and it took research and reflection to find the answer. The problem was that I had attained the top 10 values that represented the number of times the article headers had appeared. In HashMap, there is an easy method to get a value given a key, but since some HashMaps can be two-to-one functions, i.e. having two keys associated with the same value, there is no inbuilt java method that allows you to extract the key given the value. The first approach I took to solving this was writing a getKey() method of my own, however, the challenge with this was that I would then have to rewrite all the HashMap methods including get() and put() in my own class. I didn't believe this was an efficient or sustainable approach, so I moved on. I read a few articles that mentioned that there are many approaches to doing this, and I knew that this was a problem I could figure out using my skills, so I went back to basics. The second way I tackled the problem became simpler. I realized that I could compare each of my top ten values to the values in the HashMap by iterating through it using the getValue() method that outputs a value of a given key. If they were equal, I would add the key to my HashSet. This was about 3 lines of code, and much simpler that writing an entire class of my own! I was relieved when it finally worked.

-Changing which structure to add the top ten titles to
I talk about my thought process in depth below, but in the final stretches of debugging, I changed the structure I used to output the answer from a LinkedList to a HashSet. This is because the LinkedList I was using was storing duplicate values, and I wasn't sure why.

-Actually running the test file
Initially, I wrote and tested my code using a small snippet of the actual file on a platform called Codio. Though this gave me the desired output, I wanted to run it on the bigger file to actually check my output. However, the assignment file was too big to be imported into Codio, so I realized I had to use another platform. Though this was slightly stressful, because I didn't even know whether my code was correct till it ran on the dataset, I realized I had to learn how to use Terminal as it's an important skill. I tried using Visual Studio Code but that was slowing my computer down, so I downloaded the files and Googled how to run them on terminal. I learnt something new today!

# Accomplishments that I'm proud of:

I'm proud that I worked on this entirely by myself! It feels great to be independent and run a program that accomplishes something. Whenever I faced a bug, I calmly researched approaches to solving it that had been done before, and took notes on a piece of paper. Talking to myself and writing out my issues helped me be efficient and solve problems quickly. An instance of a problem that I'm proud I solved was differentiating between titles that look like this "== Egghead ==" and without spaces, like this "==Egghead==". My answers were differentiating these titles, but given that they had the same name, I came up with a solution that clubbed them together.

# What I learned:

It's better to think out an approach on paper before deciding to code it. For instance, I found this particularly helpful when debugging the issue of getting the same titles as outputs. Though I initially checked to see whether there was something wrong with the logic of my LinkedList, I took a step back and rubberducked the logic which revealed to me that a HashSet might be more useful to return the titles. This is because HashSets store values with unique hashcodes, reducing chances of repitition. When I replaced my return type from a LinkedList to a HashSet, it actually worked! I learnt to be resilient and not give up if the syntax errors were recurrent, since the final product is rewarding. 

# What's next for Find Title Frequency:

I'm glad I chose to work on this project that can parse through datasets because it has incredible potential to be developed into a solution that can find titles in more complicated and larger files! An alternative approach to this would be to find the titles using regular expressions, as they are a more generalized way to match patterns with sequences of characters.

# Citations:

https://docs.oracle.com/javase/7/docs/api/java/util/Map.Entry.html
https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#keySet--
https://stackoverflow.com/questions/1383797/java-hashmap-how-to-get-key-from-value
https://www.techiedelight.com/iterate-map-using-keyset-java/
https://stackoverflow.com/questions/15436516/get-top-10-values-in-hash-map
https://www.geeksforgeeks.org/stringbuilder-deletecharat-in-java-with-examples/#:~:text=The%20deleteCharAt(int%20index)%20method,remaining%20String%20as%20StringBuilder%20Object.

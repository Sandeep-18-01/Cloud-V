function reverseWords(sentence) {
  // Split the sentence into words
  const words = sentence.split(" ");

  // Reverse each word
  const reversedWords = words.map((word) => {
    return word.split("").reverse().join("");
  });

  // Join the reversed words to form the reversed sentence
  const reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

// Example usage
const sentence = "This is a sunny day";
const reversedSentence = reverseWords(sentence);
console.log("Reversed sentence:", reversedSentence);
// Output: "sihT si a ynnus yad"

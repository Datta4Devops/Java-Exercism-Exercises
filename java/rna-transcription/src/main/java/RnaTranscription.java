import java.util.HashMap;

class RnaTranscription {
    private HashMap<Character, Character> transcript;
    RnaTranscription()
    {
        transcript = new HashMap<>();
        transcript.put('C', 'G');
        transcript.put('G', 'C');
        transcript.put('T', 'A');
        transcript.put('A', 'U');
    }
    String transcribe(String dnaStrand) {
        if(dnaStrand.isEmpty()) return "";
        StringBuffer rnaStrand = new StringBuffer();
        for(int index=0; index<dnaStrand.length();index++)
        {
            char transcription = transcript.get(dnaStrand.charAt(index));
            rnaStrand.append(transcription);
        }
        return rnaStrand.toString();
    }

}

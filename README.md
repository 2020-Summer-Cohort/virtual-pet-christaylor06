# Virtual Pet Project Notes


Step 1: Define my pet
    Bubbles is a bulldog. He needs help with practicing the tricks he learned in school.
   
  Instance variables (Attributes):
   (Scale of 1 - 100 for all of these)
   - Puppy IQ
   - Happy
   - Dirty 

   Instance variable updates:
   - Bubbles wants to be a puppy genius. She gets IQ points for practising her tricks. 
   - Bubbles gains one point every time he sits
   - Bubbles gains two points every time he rolls over
   - The game ends when he gets to 50 Puppy IQ points
   - TICK - Bubbles loses two hygiene points every time he rolls over. 
     After his hygiene gets to 0 or below, the user is prompted to give him a bath.
   - Bubbles loves baths. His happiness goes up every time he's bathed
   - Bubbles loves treats. His happiness goes up every time he gets a treat

          Instance Variables I'd like to try to add if I had more time:
          - Sometimes Bubbles likes treats too much. 
            After he's had too many her happiness goes down for each one  
          - If the uses opts to "Do nothing" for 2 iterations, Bubbles loses 10 IQ points
          - Change Bubbles to hate baths. With each bath, hygiene goes up but happiness goes down
          - Would also like to make hygiene and happy push out strings that say if bubbles if happy, 
            sad, clean, dirty, or too dirty.

   Methods (Commands)
   1. Tell Bubbles to sit. method = sitBubbles
   2. Tell Bubbles to roll over. method = rollBubbles
   3. Give Bubbles a bath. method = batheBubbles
   4. Give Bubbles a treat. method = goodBubbles
   5. Do nothing

Step 2: Testing Asserts
 - Puppy IQ
    - created tests for defaults of 10 and 50
    - created tests for the ability to add IQ points for sitting (1 point) and rolling (2 points)  
    - created test for maximum IQ of 50.0 when rolling (was 100 but changes to 50 to make game time shorter)
    - created test for maximum IQ of 50.0 when sitting

 - Happy
     - created tests for defaults of 5 and 10
     - created test for the ability to lose Happy points with a bath (2 points)**
        -  **Couldn't get this to work in the application
     - created test for the ability to gain Happy points with a treat (1 points) 
     - created test for minimal happiness when bathing
     - created test for maximum happiness from treats 
     
 Will see if I can work on these later
 - Have Happy status tell Bubble's mood as a string "Sad" (less than 5) and "Happy" (5 or greater)


 
 
  
    



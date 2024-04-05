IMAD5112 Assignment 1 05/04/2024

ST10454062 Jolandri Cilliers

My History App

-------------------------------------------------------------------------

The Arts App

**1) Purpose**

The purpose of The Arts App is to give information to the user about
different historical figures and at what age they died. The target
audience is children. This app can be used for information purposes or
for fun if they get curious. This app will also be helpful for both
teachers and parents.

**2) Design Considerations**

Intuitive Design:

My app is quite easy to follow. Everything follows the structure from
top to bottom. The main imageview is seen at the top of the page and the
edittext is placed under it. Under the edit text, the two buttons are
next to each other from left to right. At the bottom, the text view and
image view follow the same structure from left to right.

Content Prioritization:

The app prioritizes the most necessary elements that will make this app
run successfully. Two buttons are included in the app for generating and
clearing information. The main text at the top of the page displays what
the app is about, and the text view displays information. Lastly the
edittext inputs the ages of the figures.

Legible text content:

It is quite easy to read the text in the app. The text sizes in all the
formats are big enough to be read. The textview that give the
information is the size of 20dp. The app is not only targeted towards
children but all age groups, so it is important for everyone to read it.

Make Interface Elements Clearly Visible:

The interface is not too crowded. There is enough white space, and all
the components are spaced well apart to be clearly seen. The colour also
plays a big part in the interface. It was important to use more natural
colours as this is easy on the user's eyes. The colours I mainly used
was pink and brown. It was an important decision to have the app evoke a
sense of calmness and peace. The users shouldn't be too overwhelmed with
colour and elements in the app.

Hand position controls:

All the buttons are placed in such a way that it is easy to reach. All
the buttons and edit texts are placed in the middle of the screen.

Images:

I decided to use the images I did to illustrate the beauty of art. This
app is all about the arts, including painting, instruments, music, and
anything that inspires the mind. The main image on top is a painting
about interesting architecture in China. This is the first image that is
seen when the app is opened; it needs to draw some attention. I also
wanted to include some type of Asian culture references for the images,
as my app includes many figures from the east. The second picture is
placed at the bottom left to give the page more detail and it plays a
role in generating other images. The second image includes a drawing of
a Chinese instrument. When the age has been input, the information on
the historical figure pops up. The imageview gives an image
corresponding to the information.

<img src="/media/image4.png" style="width:2.24891in;height:3.69797in" />

<img src="/media/image5.png" style="width:2.33937in;height:3.88259in" /><img src="/media/image6.png" style="width:2.3439in;height:3.86471in" />

**3) Github and Github actions**

1\. Create a New GitHub Repository:

Go to the GitHub website (https://github.com/) and sign in to your
account.

Click on the "+" icon in the top right corner and select "New
repository".

Give your repository a name , add a description and choose public.

Click on the "Create repository" button.

2\. Initialise the Repository with a README File:

After creating the repository, you'll see an option to "Initialize this
repository with a README". Check this option to create a README file.

Click on the "Create repository" button to finalize the creation of the
repository.

3\. Commit and Push Your Project Files to the GitHub Repository:

In Android Studio, go to VCS (Version Control System) -> Import into
Version Control -> Share Project on GitHub.

Log in to your GitHub account if prompted, and select the repository you
created earlier.

Click on the "Share" button to push your project files to the GitHub
repository.

4\. Regularly Commit and Push Your Code as You Make Progress:

After the initial push, continue making changes to your project in
Android Studio.

Whenever you make significant progress or changes, commit your changes
locally in Android Studio using VCS -> Commit Changes.

Once committed, push your changes to the GitHub repository using VCS ->
Git -> Push.

3\)

Testing and Automated Testing:

1\. Conduct Manual Testing:

Manually test your app to ensure it functions seamlessly and offers an
enjoyable educational experience for learners.

To test various features and user interactions do the following:

1\. Create a New Test Class:

In your Android project, navigate to the tests directory (or create it
if it doesn't exist).

Create a new Kotlin file for your test class. Name it appropriately to
indicate what component or functionality you are testing.

2\. Write Test Methods:

Inside the test class, write test methods like the example below.

3\. Use assertions to verify the expected behaviour of your code.

4\. Run the Tests:

Run the tests using the testing framework's tools provided by Android
Studio or through the command line.

Sample of a test class using JUnit:

import org.junit.Assert.\*

import org.junit.Test

class MyUnitTest {

@Test

fun testWhenStatement() {

// Test case for a when statement

val result = when (25) {

31 -> "Franz Schubert was an Austrian composer best known for creating
symphonies. His most notable work includes Ave Maria, and Erlkönig."

61-> "Li Bai was a Chinese poet during the Tang dynasty. He is known for
writing romantic poems."

88-> "Hokusai was an artist during the Edo period in Japan. He is best
known for the painting, The Great Wave Off Kanagawa.”

else-> "Nobody known to me died at this age."

}

assertEquals("Nobody famous known to me died at this age", result)

}

}

2\. GitHub Actions for Automated Testing:

Set up GitHub Actions to automatically run tests and build your code
whenever changes are pushed to the repository.

Create a GitHub Actions workflow (.github/workflows/tests.yml) to run
tests automatically on every push:

Create a .github/workflows directory in your project repository.

Inside this directory, create YAML files defining your GitHub Actions
workflows for testing and building.

Sample GitHub Actions Workflow for Testing (tests.yml):

name: Run Tests

on: \[push\]

jobs:

test:

runs-on: ubuntu-latest

steps:

\- name: Set up JDK

uses: actions/setup-java@v2

with:

distribution: 'adopt'

java-version: '11'

\- name: Check out code

uses: actions/checkout@v2

\- name: Build and test

run: ./gradlew test

Set Up Automated Build:

Create a GitHub Actions workflow (.github/workflows/build.yml) to build
the APK automatically on every push.

Sample GitHub Actions Workflow for Building (build.yml):

name: Build APK

on: \[push\]

jobs:

build:

runs-on: ubuntu-latest

steps:

\- name: Set up JDK

uses: actions/setup-java@v2

with:

distribution: 'adopt'

java-version: '11'

\- name: Check out code

uses: actions/checkout@v2

\- name: Build APK

run: ./gradlew assembleDebug

Test your workflows by pushing changes to your repository and observing
the actions running in the "Actions" tab on GitHub.

**4) Youtube link**

https://youtu.be/oFxU0ULitYg

**5) References**

Belozerova, V.G., 2021. Analysis of the Scroll ‘Ba Bridge in the Snow’:
The Results of the Creative Journey of Shen Zhou (1427–1509).

Eliot, T.S., 2021. *Selected poems*. eBookIt. Com.

Feltens, F., 2020. *Hokusai's Brush: Paintings, Drawings, and Sketches
by Katsushika Hokusai in the Smithsonian Freer Gallery of Art*.
Smithsonian Institution.

Pauwels, E.K., 2022. Ten famous composers of the romantic era and their
causes of death. *Medical Principles and Practice*, *31*(1), pp.20-28.

Poe, E.A., 2020. *The complete tales & poems of Edgar Allan Poe*. Rock
Point.

Tatipang, D.P., 2022. William Shakespeare and Modern English: To What
Extent the Influence of Him in Modern English. *Journal of English
Language Teaching, Literature and Culture*, *1*(1), pp.61-71.

Van Gogh, V., 2021. Starry night. In *In the Mind's Eye* (pp. 57-67).
Routledge.

Waley, A. and Li, B., 2022. *The Poet Li Po, AD 701-762*. DigiCat.

<https://images.app.goo.gl/6QP5nztvac4LYej16>

<https://images.app.goo.gl/Q39WTkZifomGLmNBA>

<https://images.app.goo.gl/AgsN7r9iKE4taxbV7>

<https://images.app.goo.gl/svWfsKfxQVRBb1qq7>

<https://images.app.goo.gl/DVo3FFS6TodPr2Xd8>

<https://images.app.goo.gl/ZeEzjLpte8wQbuZL7>

<https://images.app.goo.gl/2H5VQjBhJv4L9Hsp7>

<https://images.app.goo.gl/NdijuwSMpzBsnx7j6>

<https://images.app.goo.gl/8YkgshjpyPzadrNB6>

<https://images.app.goo.gl/pEH7F4JxbbiM7C819>

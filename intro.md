# java


## jre
java runtime execution?
- `java -jar my_application.jar`
lanciare i programmi
### jvm
java virtual machine
ce ne sono diverse per diverse architetture: ottimizzazioni di performance

## jdk
java developer kit
- `javac main.java -o executable`
  -> `./executable`

### install jdk
https://chocolatey.org/install
choco install openjdk.portable

Press Windows key + R to open up a Run dialog box. Then, type “sysdm.cpl” and press Enter to open the System Properties window.
Run dialog: sysdm.cpl

In the New System Variable window, set the Variable name to JAVA_HOME and the Variable value to the path to your JDK directory. To save the changes, click OK.

#### abbiamo aggiunto il percorso dei file della jdk cosi' li possiamo usare da ovunque
edit JAVA_HOME to be 

C:\ProgramData\chocolatey\lib\openjdk.portable\tools\jdk-12.0.2\bin

##### perche'
il path e' come il terminale trova i programmi

https://appuals.com/fix-javac-is-not-recognized-on-windows-10/

%JAVA_HOME%

# what to do

`javac *.java` -> compila tutti i file che finiscono con .java -> genera `.class` for each file

`java -cp C:\Users\emacr\Documents\GitHub\Esercizioqueue\src\main\java\javacoda1  Main`
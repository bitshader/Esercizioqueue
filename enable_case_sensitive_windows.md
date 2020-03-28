https://www.howtogeek.com/354220/how-to-enable-case-sensitive-folders-on-windows-10/

``
fsutil.exe file setCaseSensitiveInfo C:\Users\emacr\Documents\GitHub\Esercizioqueue\src\main\java\javacoda1 enable

fsutil.exe file setCaseSensitiveInfo '.\src\main\java\javacoda1' enable
```

Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Windows-Subsystem-Linux
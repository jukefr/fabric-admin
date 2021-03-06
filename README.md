# Fabric Admin

# Buy me covfefe ❤️
```
BTC     bc1qjqzkrfupcrgtzpeu0pmut24vq8tfzs9rqe6458
ETH     0x799b3b5520525CDd95d1D5C7Ba1a2Ee6037B1bFE
ADA     addr1q8mz3z7cw4jz9dacvpz6dpw2c6xke6nv8vk6rfnt7mkaat8vgnu796g5vrarn4pjgpdqkare9zryx645e25wcae8636q97typg
XRP     r3Bpcyp8zVNkaDzpppdRTuSXSvxAUJXAVj
LTC     ltc1qpja2nr6x9nz3q3ya3ec6ec5hxvm8dz52urn39z
BCH     1NAteBJF7wKw8BdzLJ6YE65ja1ZAHf68jf
DOGE    DL4VNBx6EGuPcgnJrfgxok9tTvcbVGKx3R
XMR     89S6qYdMJyZZ8ddKtFqTzGhuDZxJkNcmL9L6KzTSw7AeQos1uku2GBhBaHLUYtgv4TQRRQuNF4FixAu6geKC2r25NyWZj2Q
DASH    XtffD9gZFDKWWpabMyAi8sF9EeDREH5dUy
DCR     DsSAqeDekTCvbd84GkAofHyutrFrFDX1EnD
ZEC     t1P336iRRMM6Yu2wTzXJmjm6p4RgNAQkgsM
STRAX   SVfFcCZtQ8yMSMxc2K8xzFr4psHpGpnKNT 
```

This mod aims to be an all in one suite that meets technical (IT technical, not redstone technical) server administrator needs

None of it will provide any visible in game functionality (but can optimize while keeping vanilla functionality) or commands and whatnot but will expose ports and send data to ports and to database stuff and neato sysadmin stuffs you know...

## TODO
- [x] Setup embedded DB as "temporary storage area" in case of excessive ingress/egress
- [x] Setup ORM/DAO layer 
- [x] setup Dockerized testing/build env
- [ ] configuration lib integration
- [ ] modular orchestration of components
- [ ] see how java docs are handled
- [ ] setup contribooting stoofs
- [ ] ES logging layer mixins
    - [ ] log EVERYTHING
    - [ ] new chunks
- [ ] ES APM modules mixins
    - [ ] TPS
    - [ ] Active Players
    - [ ] Loaded Chunks / Chunk Load Times / High TPS Impact Chunks
    - [ ] Events
- [ ] ES/Logstash mappings
- [ ] Kibana config ?
- [ ] scheduling module
    - [ ] cron style
    - [ ] on events mixins (playercount, tps...)
- [ ] optimizations
    - [ ] redstone phd thesis
- [ ] misc / non-vanilla
    - [ ] tab list edit, already pretty much done just port over
        - [ ] donation goal linked to some API or w/e
    - [ ] player death messages, already pretty much done just port over and make the messages an SQL table or smth idk
    - [ ] inventory unload 
    - [ ] anticheat/antiexploit, mostly just stuff that messes with TPS or crashes the server idc about dupes etc
- [ ] maybe learn java at this point
    - [ ] topkek as if i'd waste braincells on that *wheeze*
    
## Special mention
I won't be doing anything related to windows as this is a server side mod intended for actual production instances if you catch my drift timmy.
Feel free to open a PR though to make it work if you can/want.

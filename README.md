# Fabric Admin
This mod aims to be an all in one suite that meets technical (IT technical, not redstone technical) server administrator needs

None of it will provide any visible in game functionality (but can optimize while keeping vanilla functionality) or commands and whatnot but will expose ports and send data to ports and to database stuff and neato sysadmin stuffs you know...

## TODO
- [x] Setup embedded DB as "temporary storage area" in case of excessive ingress/egress
- [x] Setup ORM/DAO layer 
- [ ] setup Dockerized testing/build env
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
# Split packages: one commit per item

Each commit below is one item; each is also on its own branch `item/<key>` from the pin (`d60a029ffc6`).

| commit | item | upstream | change |
|---|---|---|---|
| `a862096da8c` | Remove stale Liquibase Dev UI duplicates from quarkus-liquibase | — | 2 files changed, 95 deletions(-) |
| `956ea82aeb2` | Move CacheManagerInfo and CaffeineCache to quarkus-cache-api | — | 2 files changed, 0 insertions(+), 0 deletions(-) |
| `9884a743480` | Bootstrap: end the split packages, deprecating the old names | #44712 | 43 files changed, 1052 insertions(+), 868 deletions(-) |
| `ce8083bc6af` | Undertow: move the deployment build steps out of the SPI's package | #44746 | 6 files changed, 22 insertions(+), 8 deletions(-) |
| `92f27b84a01` | Amazon Lambda: end the deployment split, deprecate the HTTP and REST mock event servers' old names | #44719 | 13 files changed, 393 insertions(+), 354 deletions(-) |
| `a6b9174935d` | Remove the deprecated Kotlin copy of io.quarkus.hibernate.reactive.panache.Panache | — | 3 files changed, 2 insertions(+), 149 deletions(-) |
| `ba2e4fb755d` | Bootstrap app-model: a named module, io.quarkus.bootstrap.app.model | #51581 | 2 files changed, 18 insertions(+), 1 deletion(-) |
| `aab8062b110` | core/launcher and core/runtime: named modules io.quarkus.launcher and io.quarkus.core | #53223 | 3 files changed, 85 insertions(+) |
| `77d04b3e960` | Redis client: carve the API into an ADR 0009 runtime-api module | ADR 0009 | 234 files changed, 138 insertions(+), 59 deletions(-) |

quarkus-fs-util: branch `rozip-qualified-export` adds `exports io.quarkus.fs.util.rozip to io.quarkus.bootstrap.app.model`; the app-model commit builds against it (a snapshot version until released).

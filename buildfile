require 'buildr/scala'

# Repositories
M2_REPO = 'http://repo1.maven.org/maven2/'

# Dependencies
COMMONS_CODEC = 'commons-codec:commons-codec:jar:1.4'

# Properties
SCRIBE_VERSION = '0.0.1'

repositories.remote << M2_REPO

define 'scribe-scala' do
  project.version = SCRIBE_VERSION
  compile.with COMMONS_CODEC
  test.using :scalatest
  package :jar
end
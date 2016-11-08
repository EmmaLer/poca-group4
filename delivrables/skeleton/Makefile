SRC = src
SOURCES = $(shell ls $(SRC)/*.scala)
S = scala
SC = scalac
TARGET = target
CP = $(TARGET):scalatest.jar

compile: $(SOURCES:.scala=.class)

%.class: %.scala
	@echo "Compilation $*.scala.."
	@$(SC) -cp $(CP) -d . $*.scala

clean:
	@$(RM) $(SRC)/*.class

#!/bin/bash
sbt -Dbrowser=firefox 'test-only com.cjwwdev.cucumber.utils.Runner'

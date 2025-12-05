
#version 330
in vec2 vUv;
out vec4 outColor;
uniform sampler2D currentFrame;
uniform sampler2D historyFrame;
uniform float intensity;
void main() {
    vec4 cur = texture(currentFrame, vUv);
    vec4 hist = texture(historyFrame, vUv);
    outColor = mix(cur, hist, intensity);
}

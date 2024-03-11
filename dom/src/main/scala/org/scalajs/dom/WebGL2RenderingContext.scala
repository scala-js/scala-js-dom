package org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import scala.scalajs.js.typedarray._

@js.native
@JSGlobal
class WebGL2RenderingContext extends WebGLRenderingContext {

  /** @groupname Getting_GL_parameter_information Getting GL parameter information */
  /** @groupdesc Getting_GL_parameter_information
    *   Constants passed to [[WebGLRenderingContext.getParameter]] to specify what information to return.
    */
  /** 0x0C02
    * @group Getting_GL_parameter_information
    */
  val READ_BUFFER: Int = js.native

  /** 0x0CF2
    * @group Getting_GL_parameter_information
    */
  val UNPACK_ROW_LENGTH: Int = js.native

  /** 0x0CF3
    * @group Getting_GL_parameter_information
    */
  val UNPACK_SKIP_ROWS: Int = js.native

  /** 0x0CF4
    * @group Getting_GL_parameter_information
    */
  val UNPACK_SKIP_PIXELS: Int = js.native

  /** 0x0D02
    * @group Getting_GL_parameter_information
    */
  val PACK_ROW_LENGTH: Int = js.native

  /** 0x0D03
    * @group Getting_GL_parameter_information
    */
  val PACK_SKIP_ROWS: Int = js.native

  /** 0x0D04
    * @group Getting_GL_parameter_information
    */
  val PACK_SKIP_PIXELS: Int = js.native

  /** 0x806A
    * @group Getting_GL_parameter_information
    */
  val TEXTURE_BINDING_3D: Int = js.native

  /** 0x806D
    * @group Getting_GL_parameter_information
    */
  val UNPACK_SKIP_IMAGES: Int = js.native

  /** 0x806E
    * @group Getting_GL_parameter_information
    */
  val UNPACK_IMAGE_HEIGHT: Int = js.native

  /** 0x8073
    * @group Getting_GL_parameter_information
    */
  val MAX_3D_TEXTURE_SIZE: Int = js.native

  /** 0x80E8
    * @group Getting_GL_parameter_information
    */
  val MAX_ELEMENTS_VERTICES: Int = js.native

  /** 0x80E9
    * @group Getting_GL_parameter_information
    */
  val MAX_ELEMENTS_INDICES: Int = js.native

  /** 0x84FD
    * @group Getting_GL_parameter_information
    */
  val MAX_TEXTURE_LOD_BIAS: Int = js.native

  /** 0x8B49
    * @group Getting_GL_parameter_information
    */
  val MAX_FRAGMENT_UNIFORM_COMPONENTS: Int = js.native

  /** 0x8B4A
    * @group Getting_GL_parameter_information
    */
  val MAX_VERTEX_UNIFORM_COMPONENTS: Int = js.native

  /** 0x88FF
    * @group Getting_GL_parameter_information
    */
  val MAX_ARRAY_TEXTURE_LAYERS: Int = js.native

  /** 0x8904
    * @group Getting_GL_parameter_information
    */
  val MIN_PROGRAM_TEXEL_OFFSET: Int = js.native

  /** 0x8905
    * @group Getting_GL_parameter_information
    */
  val MAX_PROGRAM_TEXEL_OFFSET: Int = js.native

  /** 0x8B4B
    * @group Getting_GL_parameter_information
    */
  val MAX_VARYING_COMPONENTS: Int = js.native

  /** 0x8B8B
    * @group Getting_GL_parameter_information
    */
  val FRAGMENT_SHADER_DERIVATIVE_HINT: Int = js.native

  /** 0x8C89
    * @group Getting_GL_parameter_information
    */
  val RASTERIZER_DISCARD: Int = js.native

  /** 0x85B5
    * @group Getting_GL_parameter_information
    */
  val VERTEX_ARRAY_BINDING: Int = js.native

  /** 0x9122
    * @group Getting_GL_parameter_information
    */
  val MAX_VERTEX_OUTPUT_COMPONENTS: Int = js.native

  /** 0x9125
    * @group Getting_GL_parameter_information
    */
  val MAX_FRAGMENT_INPUT_COMPONENTS: Int = js.native

  /** 0x9111
    * @group Getting_GL_parameter_information
    */
  val MAX_SERVER_WAIT_TIMEOUT: Int = js.native

  /** 0x8D6B
    * @group Getting_GL_parameter_information
    */
  val MAX_ELEMENT_INDEX: Int = js.native

  /** @groupname Textures Textures */
  /** @groupdesc Textures
    *   Constants passed to [[WebGLRenderingContext.texParameteri]], [[WebGLRenderingContext.texParameterf]],
    *   [[WebGLRenderingContext.bindTexture]], [[WebGLRenderingContext.texImage2D]], and others.
    */
  /** 0x1903
    * @group Textures
    */
  val RED: Int = js.native

  /** 0x8051
    * @group Textures
    */
  val RGB8: Int = js.native

  /** 0x8058
    * @group Textures
    */
  val RGBA8: Int = js.native

  /** 0x8059
    * @group Textures
    */
  val RGB10_A2: Int = js.native

  /** 0x806F
    * @group Textures
    */
  val TEXTURE_3D: Int = js.native

  /** 0x8072
    * @group Textures
    */
  val TEXTURE_WRAP_R: Int = js.native

  /** 0x813A
    * @group Textures
    */
  val TEXTURE_MIN_LOD: Int = js.native

  /** 0x813B
    * @group Textures
    */
  val TEXTURE_MAX_LOD: Int = js.native

  /** 0x813C
    * @group Textures
    */
  val TEXTURE_BASE_LEVEL: Int = js.native

  /** 0x813D
    * @group Textures
    */
  val TEXTURE_MAX_LEVEL: Int = js.native

  /** 0x884C
    * @group Textures
    */
  val TEXTURE_COMPARE_MODE: Int = js.native

  /** 0x884D
    * @group Textures
    */
  val TEXTURE_COMPARE_FUNC: Int = js.native

  /** 0x8C40
    * @group Textures
    */
  val SRGB: Int = js.native

  /** 0x8C41
    * @group Textures
    */
  val SRGB8: Int = js.native

  /** 0x8C43
    * @group Textures
    */
  val SRGB8_ALPHA8: Int = js.native

  /** 0x884E
    * @group Textures
    */
  val COMPARE_REF_TO_TEXTURE: Int = js.native

  /** 0x8814
    * @group Textures
    */
  val RGBA32F: Int = js.native

  /** 0x8815
    * @group Textures
    */
  val RGB32F: Int = js.native

  /** 0x881A
    * @group Textures
    */
  val RGBA16F: Int = js.native

  /** 0x881B
    * @group Textures
    */
  val RGB16F: Int = js.native

  /** 0x8C1A
    * @group Textures
    */
  val TEXTURE_2D_ARRAY: Int = js.native

  /** 0x8C1D
    * @group Textures
    */
  val TEXTURE_BINDING_2D_ARRAY: Int = js.native

  /** 0x8C3A
    * @group Textures
    */
  val R11F_G11F_B10F: Int = js.native

  /** 0x8C3D
    * @group Textures
    */
  val RGB9_E5: Int = js.native

  /** 0x8D70
    * @group Textures
    */
  val RGBA32UI: Int = js.native

  /** 0x8D71
    * @group Textures
    */
  val RGB32UI: Int = js.native

  /** 0x8D76
    * @group Textures
    */
  val RGBA16UI: Int = js.native

  /** 0x8D77
    * @group Textures
    */
  val RGB16UI: Int = js.native

  /** 0x8D7C
    * @group Textures
    */
  val RGBA8UI: Int = js.native

  /** 0x8D7D
    * @group Textures
    */
  val RGB8UI: Int = js.native

  /** 0x8D82
    * @group Textures
    */
  val RGBA32I: Int = js.native

  /** 0x8D83
    * @group Textures
    */
  val RGB32I: Int = js.native

  /** 0x8D88
    * @group Textures
    */
  val RGBA16I: Int = js.native

  /** 0x8D89
    * @group Textures
    */
  val RGB16I: Int = js.native

  /** 0x8D8E
    * @group Textures
    */
  val RGBA8I: Int = js.native

  /** 0x8D8F
    * @group Textures
    */
  val RGB8I: Int = js.native

  /** 0x8D94
    * @group Textures
    */
  val RED_INTEGER: Int = js.native

  /** 0x8D98
    * @group Textures
    */
  val RGB_INTEGER: Int = js.native

  /** 0x8D99
    * @group Textures
    */
  val RGBA_INTEGER: Int = js.native

  /** 0x8229
    * @group Textures
    */
  val R8: Int = js.native

  /** 0x822B
    * @group Textures
    */
  val RG8: Int = js.native

  /** 0x822D
    * @group Textures
    */
  val R16F: Int = js.native

  /** 0x822E
    * @group Textures
    */
  val R32F: Int = js.native

  /** 0x822F
    * @group Textures
    */
  val RG16F: Int = js.native

  /** 0x8230
    * @group Textures
    */
  val RG32F: Int = js.native

  /** 0x8231
    * @group Textures
    */
  val R8I: Int = js.native

  /** 0x8232
    * @group Textures
    */
  val R8UI: Int = js.native

  /** 0x8233
    * @group Textures
    */
  val R16I: Int = js.native

  /** 0x8234
    * @group Textures
    */
  val R16UI: Int = js.native

  /** 0x8235
    * @group Textures
    */
  val R32I: Int = js.native

  /** 0x8236
    * @group Textures
    */
  val R32UI: Int = js.native

  /** 0x8237
    * @group Textures
    */
  val RG8I: Int = js.native

  /** 0x8238
    * @group Textures
    */
  val RG8UI: Int = js.native

  /** 0x8239
    * @group Textures
    */
  val RG16I: Int = js.native

  /** 0x823A
    * @group Textures
    */
  val RG16UI: Int = js.native

  /** 0x823B
    * @group Textures
    */
  val RG32I: Int = js.native

  /** 0x823C
    * @group Textures
    */
  val RG32UI: Int = js.native

  /** 0x8F94
    * @group Textures
    */
  val R8_SNORM: Int = js.native

  /** 0x8F95
    * @group Textures
    */
  val RG8_SNORM: Int = js.native

  /** 0x8F96
    * @group Textures
    */
  val RGB8_SNORM: Int = js.native

  /** 0x8F97
    * @group Textures
    */
  val RGBA8_SNORM: Int = js.native

  /** 0x906F
    * @group Textures
    */
  val RGB10_A2UI: Int = js.native

  /** 0x912F
    * @group Textures
    */
  val TEXTURE_IMMUTABLE_FORMAT: Int = js.native

  /** 0x82DF
    * @group Textures
    */
  val TEXTURE_IMMUTABLE_LEVELS: Int = js.native

  /** @groupname Pixel_types Pixel types */
  /** 0x8368
    * @group Pixel_types
    */
  val UNSIGNED_INT_2_10_10_10_REV: Int = js.native

  /** 0x8C3B
    * @group Pixel_types
    */
  val UNSIGNED_INT_10F_11F_11F_REV: Int = js.native

  /** 0x8C3E
    * @group Pixel_types
    */
  val UNSIGNED_INT_5_9_9_9_REV: Int = js.native

  /** 0x8DAD
    * @group Pixel_types
    */
  val FLOAT_32_UNSIGNED_INT_24_8_REV: Int = js.native

  /** 0x84FA
    * @group Pixel_types
    */
  val UNSIGNED_INT_24_8: Int = js.native

  /** 0x140B
    * @group Pixel_types
    */
  val HALF_FLOAT: Int = js.native

  /** 0x8227
    * @group Pixel_types
    */
  val RG: Int = js.native

  /** 0x8228
    * @group Pixel_types
    */
  val RG_INTEGER: Int = js.native

  /** 0x8D9F
    * @group Pixel_types
    */
  val INT_2_10_10_10_REV: Int = js.native

  /** @groupname Queries Queries */
  /** 0x8865
    * @group Queries
    */
  val CURRENT_QUERY: Int = js.native

  /** 0x8866
    * @group Queries
    */
  val QUERY_RESULT: Int = js.native

  /** 0x8867
    * @group Queries
    */
  val QUERY_RESULT_AVAILABLE: Int = js.native

  /** 0x8C2F
    * @group Queries
    */
  val ANY_SAMPLES_PASSED: Int = js.native

  /** 0x8D6A
    * @group Queries
    */
  val ANY_SAMPLES_PASSED_CONSERVATIVE: Int = js.native

  /** @groupname Draw_buffers Draw buffers */
  /** 0x8824
    * @group Draw_buffers
    */
  val MAX_DRAW_BUFFERS: Int = js.native

  /** 0x8825
    * @group Draw_buffers
    */
  val DRAW_BUFFER0: Int = js.native

  /** 0x8826
    * @group Draw_buffers
    */
  val DRAW_BUFFER1: Int = js.native

  /** 0x8827
    * @group Draw_buffers
    */
  val DRAW_BUFFER2: Int = js.native

  /** 0x8828
    * @group Draw_buffers
    */
  val DRAW_BUFFER3: Int = js.native

  /** 0x8829
    * @group Draw_buffers
    */
  val DRAW_BUFFER4: Int = js.native

  /** 0x882A
    * @group Draw_buffers
    */
  val DRAW_BUFFER5: Int = js.native

  /** 0x882B
    * @group Draw_buffers
    */
  val DRAW_BUFFER6: Int = js.native

  /** 0x882C
    * @group Draw_buffers
    */
  val DRAW_BUFFER7: Int = js.native

  /** 0x882D
    * @group Draw_buffers
    */
  val DRAW_BUFFER8: Int = js.native

  /** 0x882E
    * @group Draw_buffers
    */
  val DRAW_BUFFER9: Int = js.native

  /** 0x882F
    * @group Draw_buffers
    */
  val DRAW_BUFFER10: Int = js.native

  /** 0x8830
    * @group Draw_buffers
    */
  val DRAW_BUFFER11: Int = js.native

  /** 0x8831
    * @group Draw_buffers
    */
  val DRAW_BUFFER12: Int = js.native

  /** 0x8832
    * @group Draw_buffers
    */
  val DRAW_BUFFER13: Int = js.native

  /** 0x8833
    * @group Draw_buffers
    */
  val DRAW_BUFFER14: Int = js.native

  /** 0x8834
    * @group Draw_buffers
    */
  val DRAW_BUFFER15: Int = js.native

  /** 0x8CDF
    * @group Draw_buffers
    */
  val MAX_COLOR_ATTACHMENTS: Int = js.native

  /** 0x8CE1
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT1: Int = js.native

  /** 0x8CE2
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT2: Int = js.native

  /** 0x8CE3
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT3: Int = js.native

  /** 0x8CE4
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT4: Int = js.native

  /** 0x8CE5
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT5: Int = js.native

  /** 0x8CE6
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT6: Int = js.native

  /** 0x8CE7
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT7: Int = js.native

  /** 0x8CE8
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT8: Int = js.native

  /** 0x8CE9
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT9: Int = js.native

  /** 0x8CEA
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT10: Int = js.native

  /** 0x8CEB
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT11: Int = js.native

  /** 0x8CEC
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT12: Int = js.native

  /** 0x8CED
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT13: Int = js.native

  /** 0x8CEE
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT14: Int = js.native

  /** 0x8CEF
    * @group Draw_buffers
    */
  val COLOR_ATTACHMENT15: Int = js.native

  /** @groupname Samplers Samplers */
  /** 0x8B5F
    * @group Samplers
    */
  val SAMPLER_3D: Int = js.native

  /** 0x8B62
    * @group Samplers
    */
  val SAMPLER_2D_SHADOW: Int = js.native

  /** 0x8DC1
    * @group Samplers
    */
  val SAMPLER_2D_ARRAY: Int = js.native

  /** 0x8DC4
    * @group Samplers
    */
  val SAMPLER_2D_ARRAY_SHADOW: Int = js.native

  /** 0x8DC5
    * @group Samplers
    */
  val SAMPLER_CUBE_SHADOW: Int = js.native

  /** 0x8DCA
    * @group Samplers
    */
  val INT_SAMPLER_2D: Int = js.native

  /** 0x8DCB
    * @group Samplers
    */
  val INT_SAMPLER_3D: Int = js.native

  /** 0x8DCC
    * @group Samplers
    */
  val INT_SAMPLER_CUBE: Int = js.native

  /** 0x8DCF
    * @group Samplers
    */
  val INT_SAMPLER_2D_ARRAY: Int = js.native

  /** 0x8DD2
    * @group Samplers
    */
  val UNSIGNED_INT_SAMPLER_2D: Int = js.native

  /** 0x8DD3
    * @group Samplers
    */
  val UNSIGNED_INT_SAMPLER_3D: Int = js.native

  /** 0x8DD4
    * @group Samplers
    */
  val UNSIGNED_INT_SAMPLER_CUBE: Int = js.native

  /** 0x8DD7
    * @group Samplers
    */
  val UNSIGNED_INT_SAMPLER_2D_ARRAY: Int = js.native

  /** 0x8D57
    * @group Samplers
    */
  val MAX_SAMPLES: Int = js.native

  /** 0x8919
    * @group Samplers
    */
  val SAMPLER_BINDING: Int = js.native

  /** @groupname Buffers Buffers */
  /** 0x88EB
    * @group Buffers
    */
  val PIXEL_PACK_BUFFER: Int = js.native

  /** 0x88EC
    * @group Buffers
    */
  val PIXEL_UNPACK_BUFFER: Int = js.native

  /** 0x88ED
    * @group Buffers
    */
  val PIXEL_PACK_BUFFER_BINDING: Int = js.native

  /** 0x88EF
    * @group Buffers
    */
  val PIXEL_UNPACK_BUFFER_BINDING: Int = js.native

  /** 0x8F36
    * @group Buffers
    */
  val COPY_READ_BUFFER: Int = js.native

  /** 0x8F37
    * @group Buffers
    */
  val COPY_WRITE_BUFFER: Int = js.native

  /** 0x8F36
    * @group Buffers
    */
  val COPY_READ_BUFFER_BINDING: Int = js.native

  /** 0x8F37
    * @group Buffers
    */
  val COPY_WRITE_BUFFER_BINDING: Int = js.native

  /** @groupname Data_types Data types */
  /** 0x8B65
    * @group Data_types
    */
  val FLOAT_MAT2x3: Int = js.native

  /** 0x8B66
    * @group Data_types
    */
  val FLOAT_MAT2x4: Int = js.native

  /** 0x8B67
    * @group Data_types
    */
  val FLOAT_MAT3x2: Int = js.native

  /** 0x8B68
    * @group Data_types
    */
  val FLOAT_MAT3x4: Int = js.native

  /** 0x8B69
    * @group Data_types
    */
  val FLOAT_MAT4x2: Int = js.native

  /** 0x8B6A
    * @group Data_types
    */
  val FLOAT_MAT4x3: Int = js.native

  /** 0x8DC6
    * @group Data_types
    */
  val UNSIGNED_INT_VEC2: Int = js.native

  /** 0x8DC7
    * @group Data_types
    */
  val UNSIGNED_INT_VEC3: Int = js.native

  /** 0x8DC8
    * @group Data_types
    */
  val UNSIGNED_INT_VEC4: Int = js.native

  /** 0x8C17
    * @group Data_types
    */
  val UNSIGNED_NORMALIZED: Int = js.native

  /** 0x8F9C
    * @group Data_types
    */
  val SIGNED_NORMALIZED: Int = js.native

  /** @groupname Vertex_attributes Vertex attributes */
  /** 0x88FD
    * @group Vertex_attributes
    */
  val VERTEX_ATTRIB_ARRAY_INTEGER: Int = js.native

  /** 0x88FE
    * @group Vertex_attributes
    */
  val VERTEX_ATTRIB_ARRAY_DIVISOR: Int = js.native

  /** @groupname Transform_feedback Transform feedback */
  /** 0x8C7F
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK_BUFFER_MODE: Int = js.native

  /** 0x8C80
    * @group Transform_feedback
    */
  val MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Int = js.native

  /** 0x8C83
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK_VARYINGS: Int = js.native

  /** 0x8C84
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK_BUFFER_START: Int = js.native

  /** 0x8C85
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK_BUFFER_SIZE: Int = js.native

  /** 0x8C88
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Int = js.native

  /** 0x8C8A
    * @group Transform_feedback
    */
  val MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Int = js.native

  /** 0x8C8B
    * @group Transform_feedback
    */
  val MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Int = js.native

  /** 0x8C8C
    * @group Transform_feedback
    */
  val INTERLEAVED_ATTRIBS: Int = js.native

  /** 0x8C8D
    * @group Transform_feedback
    */
  val SEPARATE_ATTRIBS: Int = js.native

  /** 0x8C8E
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK_BUFFER: Int = js.native

  /** 0x8C8F
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK_BUFFER_BINDING: Int = js.native

  /** 0x8E22
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK: Int = js.native

  /** 0x8E23
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK_PAUSED: Int = js.native

  /** 0x8E24
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK_ACTIVE: Int = js.native

  /** 0x8E25
    * @group Transform_feedback
    */
  val TRANSFORM_FEEDBACK_BINDING: Int = js.native

  /** @groupname Framebuffers_and_renderbuffers Framebuffers and renderbuffers */
  /** 0x8210
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Int = js.native

  /** 0x8211
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Int = js.native

  /** 0x8212
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_ATTACHMENT_RED_SIZE: Int = js.native

  /** 0x8213
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Int = js.native

  /** 0x8214
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Int = js.native

  /** 0x8215
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Int = js.native

  /** 0x8216
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Int = js.native

  /** 0x8217
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Int = js.native

  /** 0x8218
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_DEFAULT: Int = js.native

  /** 0x821A
    * @group Framebuffers_and_renderbuffers
    */
  val DEPTH_STENCIL_ATTACHMENT: Int = js.native

  /** 0x84F9
    * @group Framebuffers_and_renderbuffers
    */
  val DEPTH_STENCIL: Int = js.native

  /** 0x88F0
    * @group Framebuffers_and_renderbuffers
    */
  val DEPTH24_STENCIL8: Int = js.native

  /** 0x8CA6
    * @group Framebuffers_and_renderbuffers
    */
  val DRAW_FRAMEBUFFER_BINDING: Int = js.native

  /** 0x8CA8
    * @group Framebuffers_and_renderbuffers
    */
  val READ_FRAMEBUFFER: Int = js.native

  /** 0x8CA9
    * @group Framebuffers_and_renderbuffers
    */
  val DRAW_FRAMEBUFFER: Int = js.native

  /** 0x8CAA
    * @group Framebuffers_and_renderbuffers
    */
  val READ_FRAMEBUFFER_BINDING: Int = js.native

  /** 0x8CAB
    * @group Framebuffers_and_renderbuffers
    */
  val RENDERBUFFER_SAMPLES: Int = js.native

  /** 0x8CD4
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Int = js.native

  /** 0x8D56
    * @group Framebuffers_and_renderbuffers
    */
  val FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int = js.native

  /** @groupname Uniforms Uniforms */
  /** 0x8A11
    * @group Uniforms
    */
  val UNIFORM_BUFFER: Int = js.native

  /** 0x8A28
    * @group Uniforms
    */
  val UNIFORM_BUFFER_BINDING: Int = js.native

  /** 0x8A29
    * @group Uniforms
    */
  val UNIFORM_BUFFER_START: Int = js.native

  /** 0x8A2A
    * @group Uniforms
    */
  val UNIFORM_BUFFER_SIZE: Int = js.native

  /** 0x8A2B
    * @group Uniforms
    */
  val MAX_VERTEX_UNIFORM_BLOCKS: Int = js.native

  /** 0x8A2D
    * @group Uniforms
    */
  val MAX_FRAGMENT_UNIFORM_BLOCKS: Int = js.native

  /** 0x8A2E
    * @group Uniforms
    */
  val MAX_COMBINED_UNIFORM_BLOCKS: Int = js.native

  /** 0x8A2F
    * @group Uniforms
    */
  val MAX_UNIFORM_BUFFER_BINDINGS: Int = js.native

  /** 0x8A30
    * @group Uniforms
    */
  val MAX_UNIFORM_BLOCK_SIZE: Int = js.native

  /** 0x8A31
    * @group Uniforms
    */
  val MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Int = js.native

  /** 0x8A33
    * @group Uniforms
    */
  val MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Int = js.native

  /** 0x8A34
    * @group Uniforms
    */
  val UNIFORM_BUFFER_OFFSET_ALIGNMENT: Int = js.native

  /** 0x8A36
    * @group Uniforms
    */
  val ACTIVE_UNIFORM_BLOCKS: Int = js.native

  /** 0x8A37
    * @group Uniforms
    */
  val UNIFORM_TYPE: Int = js.native

  /** 0x8A38
    * @group Uniforms
    */
  val UNIFORM_SIZE: Int = js.native

  /** 0x8A3A
    * @group Uniforms
    */
  val UNIFORM_BLOCK_INDEX: Int = js.native

  /** 0x8A3B
    * @group Uniforms
    */
  val UNIFORM_OFFSET: Int = js.native

  /** 0x8A3C
    * @group Uniforms
    */
  val UNIFORM_ARRAY_STRIDE: Int = js.native

  /** 0x8A3D
    * @group Uniforms
    */
  val UNIFORM_MATRIX_STRIDE: Int = js.native

  /** 0x8A3E
    * @group Uniforms
    */
  val UNIFORM_IS_ROW_MAJOR: Int = js.native

  /** 0x8A3F
    * @group Uniforms
    */
  val UNIFORM_BLOCK_BINDING: Int = js.native

  /** 0x8A40
    * @group Uniforms
    */
  val UNIFORM_BLOCK_DATA_SIZE: Int = js.native

  /** 0x8A42
    * @group Uniforms
    */
  val UNIFORM_BLOCK_ACTIVE_UNIFORMS: Int = js.native

  /** 0x8A43
    * @group Uniforms
    */
  val UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Int = js.native

  /** 0x8A44
    * @group Uniforms
    */
  val UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Int = js.native

  /** 0x8A46
    * @group Uniforms
    */
  val UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Int = js.native

  /** @groupname Sync_objects Sync objects */
  /** 0x9112
    * @group Sync_objects
    */
  val OBJECT_TYPE: Int = js.native

  /** 0x9113
    * @group Sync_objects
    */
  val SYNC_CONDITION: Int = js.native

  /** 0x9114
    * @group Sync_objects
    */
  val SYNC_STATUS: Int = js.native

  /** 0x9115
    * @group Sync_objects
    */
  val SYNC_FLAGS: Int = js.native

  /** 0x9116
    * @group Sync_objects
    */
  val SYNC_FENCE: Int = js.native

  /** 0x9117
    * @group Sync_objects
    */
  val SYNC_GPU_COMMANDS_COMPLETE: Int = js.native

  /** 0x9118
    * @group Sync_objects
    */
  val UNSIGNALED: Int = js.native

  /** 0x9119
    * @group Sync_objects
    */
  val SIGNALED: Int = js.native

  /** 0x911A
    * @group Sync_objects
    */
  val ALREADY_SIGNALED: Int = js.native

  /** 0x911B
    * @group Sync_objects
    */
  val TIMEOUT_EXPIRED: Int = js.native

  /** 0x911C
    * @group Sync_objects
    */
  val CONDITION_SATISFIED: Int = js.native

  /** 0x911D
    * @group Sync_objects
    */
  val WAIT_FAILED: Int = js.native

  /** 0x00000001
    * @group Sync_objects
    */
  val SYNC_FLUSH_COMMANDS_BIT: Int = js.native

  /** @groupname Miscellaneous_constants Miscellaneous constants */
  /** 0x1800
    * @group Miscellaneous_constants
    */
  val COLOR: Int = js.native

  /** 0x1801
    * @group Miscellaneous_constants
    */
  val DEPTH: Int = js.native

  /** 0x1802
    * @group Miscellaneous_constants
    */
  val STENCIL: Int = js.native

  /** 0x8007
    * @group Miscellaneous_constants
    */
  val MIN: Int = js.native

  /** 0x8008
    * @group Miscellaneous_constants
    */
  val MAX: Int = js.native

  /** 0x81A6
    * @group Miscellaneous_constants
    */
  val DEPTH_COMPONENT24: Int = js.native

  /** 0x88E1
    * @group Miscellaneous_constants
    */
  val STREAM_READ: Int = js.native

  /** 0x88E2
    * @group Miscellaneous_constants
    */
  val STREAM_COPY: Int = js.native

  /** 0x88E5
    * @group Miscellaneous_constants
    */
  val STATIC_READ: Int = js.native

  /** 0x88E6
    * @group Miscellaneous_constants
    */
  val STATIC_COPY: Int = js.native

  /** 0x88E9
    * @group Miscellaneous_constants
    */
  val DYNAMIC_READ: Int = js.native

  /** 0x88EA
    * @group Miscellaneous_constants
    */
  val DYNAMIC_COPY: Int = js.native

  /** 0x8CAC
    * @group Miscellaneous_constants
    */
  val DEPTH_COMPONENT32F: Int = js.native

  /** 0x8CAD
    * @group Miscellaneous_constants
    */
  val DEPTH32F_STENCIL8: Int = js.native

  /** 0xFFFFFFFF
    * @group Miscellaneous_constants
    */
  val INVALID_INDEX: Int = js.native

  /** -1
    * @group Miscellaneous_constants
    */
  val TIMEOUT_IGNORED: Int = js.native

  /** 0x9247
    * @group Miscellaneous_constants
    */
  val MAX_CLIENT_WAIT_TIMEOUT_WEBGL: Int = js.native

  /** @groupname State_information State information */
  /** Returns indexed information about a given target.
    *
    * @group State_information
    * @param target
    *   The target for which to return information. Possible values:
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER_BINDING]]: Returns a [[WebGLBuffer]].
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER_SIZE]]: Returns a Long.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER_START]]: Returns a Long.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER_BINDING]]: Returns a [[WebGLBuffer]].
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER_SIZE]]: Returns a Long.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER_START]]: Returns a Long.
    *
    * When using the OES_draw_buffers_indexed WebGL 2 extension, the following values are available additionally:
    *   - [[WebGLRenderingContext.BLEND_EQUATION_RGB]]: Returns the RGB blend equation for the draw buffer at index.
    *   - [[WebGLRenderingContext.BLEND_EQUATION_ALPHA]]: Returns the alpha blend equation for the draw buffer at index.
    *   - [[WebGLRenderingContext.BLEND_SRC_RGB]]: Returns the source RGB blend function for the draw buffer at index.
    *   - [[WebGLRenderingContext.BLEND_SRC_ALPHA]]: Returns the source alpha blend function for the draw buffer at
    *     index.
    *   - [[WebGLRenderingContext.BLEND_DST_RGB]]: Returns the destination RGB blend function for the draw buffer at
    *     index.
    *   - [[WebGLRenderingContext.BLEND_DST_ALPHA]]: Returns the destination alpha blend function for the draw buffer at
    *     index.
    *   - [[WebGLRenderingContext.COLOR_WRITEMASK]]: Returns an array containing color components are enabled for the
    *     draw buffer at index.
    * @param index
    *   The index of the target that is queried.
    */
  def getIndexedParameter(target: Int, index: Int): js.Any = js.native

  /** @groupname Buffers Buffers */
  /** Initializes and creates the buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   The binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param srcData
    *   An ArrayBuffer or SharedArrayBuffer that will be copied into the data store. If null, a data store is still
    *   created, but the content is uninitialized and undefined.
    *
    * @param usage
    *   An Int specifying the intended usage pattern of the data store for optimization purposes. Possible values:
    *   - [[WebGLRenderingContext.STATIC_DRAW]]: The contents are intended to be specified once by the application, and
    *     used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.DYNAMIC_DRAW]]: The contents are intended to be respecified repeatedly by the
    *     application, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.STREAM_DRAW]]: The contents are intended to be specified once by the application, and
    *     used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.STATIC_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.DYNAMIC_READ]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.STREAM_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried at most a few times by the application
    *   - [[WebGL2RenderingContext$.STATIC_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.DYNAMIC_COPY]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.STREAM_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    *
    * @throws WebGLRenderingContext.OUT_OF_MEMORY
    *   if the context is unable to create a data store with the given size.
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if size is negative.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target or usage are not one of the allowed enums.
    */
  def bufferData(target: Int, srcData: ArrayBuffer, usage: Int, srcOffset: Double): Unit = js.native

  /** Initializes and creates the buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   The binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param srcData
    *   A TypedArray that will be copied into the data store. If null, a data store is still created, but the content is
    *   uninitialized and undefined.
    *
    * @param usage
    *   An Int specifying the intended usage pattern of the data store for optimization purposes. Possible values:
    *   - [[WebGLRenderingContext.STATIC_DRAW]]: The contents are intended to be specified once by the application, and
    *     used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.DYNAMIC_DRAW]]: The contents are intended to be respecified repeatedly by the
    *     application, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.STREAM_DRAW]]: The contents are intended to be specified once by the application, and
    *     used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.STATIC_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.DYNAMIC_READ]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.STREAM_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried at most a few times by the application
    *   - [[WebGL2RenderingContext$.STATIC_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.DYNAMIC_COPY]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.STREAM_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    *
    * @throws WebGLRenderingContext.OUT_OF_MEMORY
    *   if the context is unable to create a data store with the given size.
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if size is negative.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target or usage are not one of the allowed enums.
    */
  def bufferData(target: Int, srcData: TypedArray[js.Any, js.Any], usage: Int, srcOffset: Double): Unit = js.native

  /** Initializes and creates the buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   The binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param srcData
    *   A DataView that will be copied into the data store. If null, a data store is still created, but the content is
    *   uninitialized and undefined.
    *
    * @param usage
    *   An Int specifying the intended usage pattern of the data store for optimization purposes. Possible values:
    *   - [[WebGLRenderingContext.STATIC_DRAW]]: The contents are intended to be specified once by the application, and
    *     used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.DYNAMIC_DRAW]]: The contents are intended to be respecified repeatedly by the
    *     application, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.STREAM_DRAW]]: The contents are intended to be specified once by the application, and
    *     used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.STATIC_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.DYNAMIC_READ]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.STREAM_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried at most a few times by the application
    *   - [[WebGL2RenderingContext$.STATIC_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.DYNAMIC_COPY]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.STREAM_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    *
    * @throws WebGLRenderingContext.OUT_OF_MEMORY
    *   if the context is unable to create a data store with the given size.
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if size is negative.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target or usage are not one of the allowed enums.
    */
  def bufferData(target: Int, srcData: DataView, usage: Int, srcOffset: Double): Unit = js.native

  /** Initializes and creates the buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   The binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param srcData
    *   An ArrayBuffer or SharedArrayBuffer that will be copied into the data store. If null, a data store is still
    *   created, but the content is uninitialized and undefined.
    *
    * @param usage
    *   A constant specifying the intended usage pattern of the data store for optimization purposes. Possible values:
    *   - [[WebGLRenderingContext.STATIC_DRAW]]: The contents are intended to be specified once by the application, and
    *     used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.DYNAMIC_DRAW]]: The contents are intended to be respecified repeatedly by the
    *     application, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.STREAM_DRAW]]: The contents are intended to be specified once by the application, and
    *     used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.STATIC_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.DYNAMIC_READ]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.STREAM_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried at most a few times by the application
    *   - [[WebGL2RenderingContext$.STATIC_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.DYNAMIC_COPY]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.STREAM_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    *
    * @param length
    *   An Int defaulting to 0.
    *
    * @throws WebGLRenderingContext.OUT_OF_MEMORY
    *   if the context is unable to create a data store with the given size.
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if size is negative.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target or usage are not one of the allowed enums.
    */
  def bufferData(target: Int, srcData: ArrayBuffer, usage: Int, srcOffset: Double, length: Int): Unit = js.native

  /** Initializes and creates the buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   The binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param srcData
    *   A TypedArray that will be copied into the data store. If null, a data store is still created, but the content is
    *   uninitialized and undefined.
    *
    * @param usage
    *   A constant specifying the intended usage pattern of the data store for optimization purposes. Possible values:
    *   - [[WebGLRenderingContext.STATIC_DRAW]]: The contents are intended to be specified once by the application, and
    *     used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.DYNAMIC_DRAW]]: The contents are intended to be respecified repeatedly by the
    *     application, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.STREAM_DRAW]]: The contents are intended to be specified once by the application, and
    *     used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.STATIC_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.DYNAMIC_READ]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.STREAM_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried at most a few times by the application
    *   - [[WebGL2RenderingContext$.STATIC_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.DYNAMIC_COPY]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.STREAM_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    *
    * @param length
    *   An Int defaulting to 0.
    *
    * @throws WebGLRenderingContext.OUT_OF_MEMORY
    *   if the context is unable to create a data store with the given size.
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if size is negative.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target or usage are not one of the allowed enums.
    */
  def bufferData(
      target: Int, srcData: TypedArray[js.Any, js.Any], usage: Int, srcOffset: Double, length: Int
  ): Unit = js.native

  /** Initializes and creates the buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   The binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param srcData
    *   A DataView that will be copied into the data store. If null, a data store is still created, but the content is
    *   uninitialized and undefined.
    *
    * @param usage
    *   A constant specifying the intended usage pattern of the data store for optimization purposes. Possible values:
    *   - [[WebGLRenderingContext.STATIC_DRAW]]: The contents are intended to be specified once by the application, and
    *     used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.DYNAMIC_DRAW]]: The contents are intended to be respecified repeatedly by the
    *     application, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGLRenderingContext.STREAM_DRAW]]: The contents are intended to be specified once by the application, and
    *     used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.STATIC_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.DYNAMIC_READ]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and queried many times by the application.
    *   - [[WebGL2RenderingContext$.STREAM_READ]]: The contents are intended to be specified once by reading data from
    *     WebGL, and queried at most a few times by the application
    *   - [[WebGL2RenderingContext$.STATIC_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.DYNAMIC_COPY]]: The contents are intended to be respecified repeatedly by reading
    *     data from WebGL, and used many times as the source for WebGL drawing and image specification commands.
    *   - [[WebGL2RenderingContext$.STREAM_COPY]]: The contents are intended to be specified once by reading data from
    *     WebGL, and used at most a few times as the source for WebGL drawing and image specification commands.
    *
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    *
    * @param length
    *   An Int defaulting to 0.
    *
    * @throws WebGLRenderingContext.OUT_OF_MEMORY
    *   if the context is unable to create a data store with the given size.
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if size is negative.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target or usage are not one of the allowed enums.
    */
  def bufferData(target: Int, srcData: DataView, usage: Int, srcOffset: Double, length: Int): Unit = js.native

  /** Updates a subset of a buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   A constant specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param dstByteOffset
    *   A Double specifying an offset in bytes where the data replacement will start.
    *
    * @param srcData
    *   An ArrayBuffer or SharedArrayBuffer that will be copied into the data store.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if the data would be written past the end of the buffer or if data is null.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target is not one of the allowed enums.
    */
  def bufferSubData(target: Int, dstByteOffset: Double, srcData: ArrayBuffer): Unit = js.native

  /** Updates a subset of a buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   A constant specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param dstByteOffset
    *   A Double specifying an offset in bytes where the data replacement will start.
    *
    * @param srcData
    *   An DataView that will be copied into the data store.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if the data would be written past the end of the buffer or if data is null.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target is not one of the allowed enums.
    */
  def bufferSubData(target: Int, dstByteOffset: Double, srcData: DataView): Unit = js.native

  /** Updates a subset of a buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   A constant specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param dstByteOffset
    *   A Double specifying an offset in bytes where the data replacement will start.
    *
    * @param srcData
    *   An TypedArray that will be copied into the data store.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if the data would be written past the end of the buffer or if data is null.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target is not one of the allowed enums.
    */
  def bufferSubData(target: Int, dstByteOffset: Double, srcData: TypedArray[js.Any, js.Any]): Unit = js.native

  /** Updates a subset of a buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   A constant specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param dstByteOffset
    *   A Double specifying an offset in bytes where the data replacement will start.
    *
    * @param srcData
    *   An ArrayBuffer or SharedArrayBuffer that will be copied into the data store.
    *
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if the data would be written past the end of the buffer or if data is null.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target is not one of the allowed enums.
    */
  def bufferSubData(target: Int, dstByteOffset: Double, srcData: ArrayBuffer, srcOffset: Double): Unit = js.native

  /** Updates a subset of a buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   A constant specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param dstByteOffset
    *   A Double specifying an offset in bytes where the data replacement will start.
    *
    * @param srcData
    *   A DataView that will be copied into the data store.
    *
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if the data would be written past the end of the buffer or if data is null.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target is not one of the allowed enums.
    */
  def bufferSubData(target: Int, dstByteOffset: Double, srcData: DataView, srcOffset: Double): Unit = js.native

  /** Updates a subset of a buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   A constant specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    *
    * @param dstByteOffset
    *   A Double specifying an offset in bytes where the data replacement will start.
    *
    * @param srcData
    *   A TypedArray that will be copied into the data store.
    *
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if the data would be written past the end of the buffer or if data is null.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target is not one of the allowed enums.
    */
  def bufferSubData(
      target: Int, dstByteOffset: Double, srcData: TypedArray[js.Any, js.Any], srcOffset: Double
  ): Unit = js.native

  /** Updates a subset of a buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   A constant specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param dstByteOffset
    *   A Double specifying an offset in bytes where the data replacement will start.
    * @param srcData
    *   An ArrayBuffer or SharedArrayBuffer that will be copied into the data store.
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    * @param length
    *   An Int defaulting to 0.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if the data would be written past the end of the buffer or if data is null.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target is not one of the allowed enums.
    */
  def bufferSubData(
      target: Int, dstByteOffset: Double, srcData: ArrayBuffer, srcOffset: Double, length: Int
  ): Unit = js.native

  /** Updates a subset of a buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   A constant specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param dstByteOffset
    *   A Double specifying an offset in bytes where the data replacement will start.
    * @param srcData
    *   A DataView that will be copied into the data store.
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    * @param length
    *   An Int defaulting to 0.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if the data would be written past the end of the buffer or if data is null.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target is not one of the allowed enums.
    */
  def bufferSubData(
      target: Int, dstByteOffset: Double, srcData: DataView, srcOffset: Double, length: Int
  ): Unit = js.native

  /** Updates a subset of a buffer object's data store.
    *
    * @group Buffers
    * @param target
    *   A constant specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param dstByteOffset
    *   A Double specifying an offset in bytes where the data replacement will start.
    * @param srcData
    *   A TypedArray that will be copied into the data store.
    * @param srcOffset
    *   A Double specifying the element index offset where to start reading the buffer.
    * @param length
    *   An Int defaulting to 0.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if the data would be written past the end of the buffer or if data is null.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   if target is not one of the allowed enums.
    */
  def bufferSubData(
      target: Int, dstByteOffset: Double, srcData: TypedArray[js.Any, js.Any], srcOffset: Double, length: Int
  ): Unit = js.native

  /** copyBufferSubData copies part of the data of a buffer to another buffer.
    *
    * @group Buffers
    * @param readTarget
    *   A constant specifying the binding point (target) from whose data store should be read. Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another (provided
    *     specifically for copy operations).
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another (provided
    *     specifically for copy operations).
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param writeTarget
    *   A constant specifying the binding point (target) from whose data store should be written. Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *
    * When using a WebGL 2 context, the following values are available additionally:
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another (provided
    *     specifically for copy operations).
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another (provided
    *     specifically for copy operations).
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param readOffset
    *   An Int specifying the byte offset from which to start reading from the buffer.
    * @param writeOffset
    *   An Int specifying the byte offset from which to start writing to the buffer.
    * @param size
    *   An Int in bytes specifying the size of the data to be copied from readTarget to writeTarget.
    * @example
    *   {{{
    * val srcBuffer = gl.createBuffer()
    * val dstBuffer = gl.createBuffer()
    *
    * val data = Float32Array(vertices)
    * val length = vertices.length * 4
    *
    * gl.bindBuffer(WebGLRenderingContext.ARRAY_BUFFER, srcBuffer)
    * gl.bufferData(WebGLRenderingContext.ARRAY_BUFFER, data, WebGLRenderingContext.STATIC_DRAW)
    * gl.bindBuffer(WebGL2RenderingContext$.COPY_READ_BUFFER, srcBuffer)
    *
    * gl.bindBuffer(WebGLRenderingContext.ARRAY_BUFFER, dstBuffer)
    * gl.bufferData(WebGLRenderingContext.ARRAY_BUFFER, Float32Array(length), WebGLRenderingContext.STATIC_DRAW)
    *
    * gl.copyBufferSubData(WebGL2RenderingContext$.COPY_READ_BUFFER, WebGLRenderingContext.ARRAY_BUFFER, 0, 0, length)
    *   }}}
    */
  def copyBufferSubData(
      readTarget: Int, writeTarget: Int, readOffset: Double, writeOffset: Double, size: Double
  ): Unit = js.native

  /** Reads data from a buffer and writes them to an ArrayBuffer or SharedArrayBuffer.
    *
    * @group Buffers
    * @param target
    *   An Int specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param srcByteOffset
    *   A Double specifying the byte offset from which to start reading from the buffer.
    * @param dstData
    *   A TypedArray or a DataView object to copy the data to. If dstData is a DataView then dstOffset and length are
    *   interpreted in bytes, otherwise dstData's element type is used.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if
    *   - offset + returnedData.byteLength would extend beyond the end of the buffer
    *   - returnedData is null
    *   - offset is less than zero
    * @throws WebGLRenderingContext.INVALID_OPERATION
    *   if
    *   - zero is bound to target
    *   - target is TRANSFORM_FEEDBACK_BUFFER, and any transform feedback object is currently active
    * @example
    *   {{{
    * val buffer = gl.createBuffer()
    * gl.bindBuffer(WebGLRenderingContext.ARRAY_BUFFER, buffer)
    * gl.bufferData(WebGLRenderingContext.ARRAY_BUFFER, Float32Array(vertices), WebGLRenderingContext.STATIC_DRAW)
    *
    * val arrBuffer = js.ArrayBuffer(
    *   vertices.length * Float32Array.BYTES_PER_ELEMENT
    * )
    * gl.getBufferSubData(WebGLRenderingContext.ARRAY_BUFFER, 0, Float32Array(arrBuffer))
    *   }}}
    */
  def getBufferSubData(target: Int, srcByteOffset: Double, dstData: TypedArray[js.Any, js.Any]): Unit = js.native

  /** Reads data from a buffer and writes them to an ArrayBuffer or SharedArrayBuffer.
    *
    * @group Buffers
    * @param target
    *   An Int specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param srcByteOffset
    *   A Double specifying the byte offset from which to start reading from the buffer.
    * @param dstData
    *   A TypedArray or a DataView object to copy the data to. If dstData is a DataView then dstOffset and length are
    *   interpreted in bytes, otherwise dstData's element type is used.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if
    *   - offset + returnedData.byteLength would extend beyond the end of the buffer
    *   - returnedData is null
    *   - offset is less than zero
    * @throws WebGLRenderingContext.INVALID_OPERATION
    *   if
    *   - zero is bound to target
    *   - target is TRANSFORM_FEEDBACK_BUFFER, and any transform feedback object is currently active
    * @example
    *   {{{
    * val buffer = gl.createBuffer()
    * gl.bindBuffer(WebGLRenderingContext.ARRAY_BUFFER, buffer)
    * gl.bufferData(WebGLRenderingContext.ARRAY_BUFFER, Float32Array(vertices), WebGLRenderingContext.STATIC_DRAW)
    *
    * val arrBuffer = js.ArrayBuffer(
    *   vertices.length * Float32Array.BYTES_PER_ELEMENT
    * )
    * gl.getBufferSubData(WebGLRenderingContext.ARRAY_BUFFER, 0, Float32Array(arrBuffer))
    *   }}}
    */
  def getBufferSubData(target: Int, srcByteOffset: Double, dstData: DataView): Unit = js.native

  /** Reads data from a buffer and writes them to an ArrayBuffer or SharedArrayBuffer.
    *
    * @group Buffers
    * @param target
    *   An Int specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param srcByteOffset
    *   A Double specifying the byte offset from which to start reading from the buffer.
    * @param dstData
    *   A TypedArray or a DataView object to copy the data to. If dstData is a DataView then dstOffset and length are
    *   interpreted in bytes, otherwise dstData's element type is used.
    * @param dstOffset
    *   A Double specifying the element index offset to start writing in dstData.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if
    *   - offset + returnedData.byteLength would extend beyond the end of the buffer
    *   - returnedData is null
    *   - offset is less than zero
    * @throws WebGLRenderingContext.INVALID_OPERATION
    *   if
    *   - zero is bound to target
    *   - target is TRANSFORM_FEEDBACK_BUFFER, and any transform feedback object is currently active
    */
  def getBufferSubData(
      target: Int, srcByteOffset: Double, dstData: TypedArray[js.Any, js.Any], dstOffset: Double
  ): Unit = js.native

  /** Reads data from a buffer and writes them to an ArrayBuffer or SharedArrayBuffer.
    *
    * @group Buffers
    * @param target
    *   An Int specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param srcByteOffset
    *   A Double specifying the byte offset from which to start reading from the buffer.
    * @param dstData
    *   A TypedArray or a DataView object to copy the data to. If dstData is a DataView then dstOffset and length are
    *   interpreted in bytes, otherwise dstData's element type is used.
    * @param dstOffset
    *   A Double specifying the element index offset to start writing in dstData.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if
    *   - offset + returnedData.byteLength would extend beyond the end of the buffer
    *   - returnedData is null
    *   - offset is less than zero
    * @throws WebGLRenderingContext.INVALID_OPERATION
    *   if
    *   - zero is bound to target
    *   - target is TRANSFORM_FEEDBACK_BUFFER, and any transform feedback object is currently active
    */
  def getBufferSubData(target: Int, srcByteOffset: Double, dstData: DataView, dstOffset: Double): Unit = js.native

  /** Reads data from a buffer and writes them to an ArrayBuffer or SharedArrayBuffer.
    *
    * @group Buffers
    * @param target
    *   An Int specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param srcByteOffset
    *   A Double specifying the byte offset from which to start reading from the buffer.
    * @param dstData
    *   A TypedArray or a DataView object to copy the data to. If dstData is a DataView then dstOffset and length are
    *   interpreted in bytes, otherwise dstData's element type is used.
    * @param dstOffset
    *   A Double specifying the element index offset to start writing in dstData.
    * @param length
    *   An Int specifying the number of elements to copy. If this is 0 or not specified, getBufferSubData will copy
    *   until the end of dstData.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if
    *   - offset + returnedData.byteLength would extend beyond the end of the buffer
    *   - returnedData is null
    *   - offset is less than zero
    * @throws WebGLRenderingContext.INVALID_OPERATION
    *   if
    *   - zero is bound to target
    *   - target is TRANSFORM_FEEDBACK_BUFFER, and any transform feedback object is currently active
    */
  def getBufferSubData(
      target: Int, srcByteOffset: Double, dstData: TypedArray[js.Any, js.Any], dstOffset: Double, length: Int
  ): Unit = js.native

  /** Reads data from a buffer and writes them to an ArrayBuffer or SharedArrayBuffer.
    *
    * @group Buffers
    * @param target
    *   An Int specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.ARRAY_BUFFER]]: Buffer containing vertex attributes, such as vertex coordinates,
    *     texture coordinate data, or vertex color data.
    *   - [[WebGLRenderingContext.ELEMENT_ARRAY_BUFFER]]: Buffer used for element indices.
    *   - [[WebGL2RenderingContext$.COPY_READ_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.COPY_WRITE_BUFFER]]: Buffer for copying from one buffer object to another.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]: Buffer for transform feedback operations.
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]: Buffer used for storing uniform blocks.
    *   - [[WebGL2RenderingContext$.PIXEL_PACK_BUFFER]]: Buffer used for pixel transfer operations.
    *   - [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]]: Buffer used for pixel transfer operations.
    * @param srcByteOffset
    *   A Double specifying the byte offset from which to start reading from the buffer.
    * @param dstData
    *   A TypedArray or a DataView object to copy the data to. If dstData is a DataView then dstOffset and length are
    *   interpreted in bytes, otherwise dstData's element type is used.
    * @param dstOffset
    *   A Double specifying the element index offset to start writing in dstData.
    * @param length
    *   An Int specifying the number of elements to copy. If this is 0 or not specified, getBufferSubData will copy
    *   until the end of dstData.
    *
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   if
    *   - offset + returnedData.byteLength would extend beyond the end of the buffer
    *   - returnedData is null
    *   - offset is less than zero
    * @throws WebGLRenderingContext.INVALID_OPERATION
    *   if
    *   - zero is bound to target
    *   - target is [[TRANSFORM_FEEDBACK_BUFFER]], and any transform feedback object is currently active
    */
  def getBufferSubData(
      target: Int, srcByteOffset: Double, dstData: DataView, dstOffset: Double, length: Int
  ): Unit = js.native

  /** @groupname Framebuffers Framebuffers */
  /** Transfers a block of pixels from the read framebuffer to the draw framebuffer.
    *
    * @group Framebuffers
    * @param srcX0
    *   An Int specifying the left bound of the source rectangle.
    * @param srcY0
    *   An Int specifying the upper bound of the source rectangle.
    * @param srcX1
    *   An Int specifying the right bound of the source rectangle.
    * @param srcY1
    *   An Int specifying the lower bound of the source rectangle.
    * @param dstX0
    *   An Int specifying the left bound of the destination rectangle.
    * @param dstY0
    *   An Int specifying the upper bound of the destination rectangle.
    * @param dstX1
    *   An Int specifying the right bound of the destination rectangle.
    * @param dstY1
    *   An Int specifying the lower bound of the destination rectangle.
    * @param mask
    *   An Int specifying a bitwise OR mask indicating which buffers are to be copied. Possible values:
    *   - [[WebGLRenderingContext.COLOR_BUFFER_BIT]]
    *   - [[WebGLRenderingContext.DEPTH_BUFFER_BIT]]
    *   - [[WebGLRenderingContext.STENCIL_BUFFER_BIT]]
    * @param filter
    *   An Int specifying the interpolation to be applied if the image is stretched. Possible values:
    *   - [[WebGLRenderingContext.NEAREST]]
    *   - [[WebGLRenderingContext.LINEAR]]
    * @example
    *   {{{
    * gl.blitFramebuffer(
    *   0,
    *   0,
    *   canvas.width,
    *   canvas.height,
    *   0,
    *   0,
    *   canvas.width,
    *   canvas.height,
    *   WebGLRenderingContext.COLOR_BUFFER_BIT,
    *   WebGLRenderingContext.NEAREST,
    * )
    *   }}}
    */
  def blitFramebuffer(
      srcX0: Int, srcY0: Int, srcX1: Int, srcY1: Int, dstX0: Int, dstY0: Int, dstX1: Int, dstY1: Int, mask: Int,
      filter: Int
  ): Unit = js.native

  /** Attaches a single layer of a texture to a framebuffer. This method is similar to
    * [[WebGLRenderingContext.framebufferTexture2D]], but only a given single layer of the texture level is attached to
    * the attachment point.
    *
    * @group Framebuffers
    * @param target
    *   An Int specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.FRAMEBUFFER]]: Collection buffer data storage of color, alpha, depth and stencil
    *     buffers used to render an image.
    *   - [[WebGL2RenderingContext$.DRAW_FRAMEBUFFER]]: Equivalent to [[WebGLRenderingContext.FRAMEBUFFER]].
    *   - [[WebGL2RenderingContext$.READ_FRAMEBUFFER]]: Used as a source for reading operations.
    * @param attachment
    *   An Int specifying the attachment point for the texture. Possible values:
    *   - [[WebGLRenderingContext.COLOR_ATTACHMENT0]]: Attaches the texture to one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT1]]: Attaches the texture to one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT2]]: Attaches the texture to one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT3]]: Attaches the texture to one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT4]]: Attaches the texture to one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT5]]: Attaches the texture to one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT6]]: Attaches the texture to one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT7]]: Attaches the texture to one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT8]]: Attaches the texture to one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT9]]: Attaches the texture to one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT10]]: Attaches the texture to one of the framebuffer's color
    *     buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT11]]: Attaches the texture to one of the framebuffer's color
    *     buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT12]]: Attaches the texture to one of the framebuffer's color
    *     buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT13]]: Attaches the texture to one of the framebuffer's color
    *     buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT14]]: Attaches the texture to one of the framebuffer's color
    *     buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT15]]: Attaches the texture to one of the framebuffer's color
    *     buffers.
    *   - [[WebGLRenderingContext.DEPTH_ATTACHMENT]]: Attaches the texture to the framebuffer's depth buffer.
    *   - [[WebGLRenderingContext.STENCIL_ATTACHMENT]]: Attaches the texture to the framebuffer's stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL_ATTACHMENT]]: depth and stencil buffer.
    * @param texture
    *   A [[WebGLTexture]] object whose image to attach.
    * @param level
    *   An Int specifying the mipmap level of the texture image to attach.
    * @param layer
    *   An Int specifying the layer of the texture image to attach.
    * @example
    *   {{{
    * gl.framebufferTextureLayer(WebGLRenderingContext.FRAMEBUFFER, WebGLRenderingContext.COLOR_ATTACHMENT0, texture, 0, 8)
    *   }}}
    */
  def framebufferTextureLayer(
      target: Int, attachment: Int, texture: WebGLTexture, level: Int, layer: Int
  ): Unit = js.native

  /** Invalidates the contents of attachments in a framebuffer.
    *
    * @group Framebuffers
    * @param target
    *   An Int specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.FRAMEBUFFER]]: Collection buffer data storage of color, alpha, depth and stencil
    *     buffers used to render an image.
    *   - [[WebGL2RenderingContext$.DRAW_FRAMEBUFFER]]: Equivalent to [[WebGLRenderingContext.FRAMEBUFFER]].
    *   - [[WebGL2RenderingContext$.READ_FRAMEBUFFER]]: Used as a source for reading operations.
    * @param attachments
    *   An Array of Int specifying the attachment points to invalidate. Possible values:
    *   - [[WebGLRenderingContext.COLOR_ATTACHMENT0]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT1]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT2]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT3]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT4]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT5]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT6]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT7]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT8]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT9]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT10]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT11]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT12]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT13]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT14]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT15]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGLRenderingContext.DEPTH_ATTACHMENT]]: Invalidates the framebuffer's depth buffer.
    *   - [[WebGLRenderingContext.STENCIL_ATTACHMENT]]: Invalidates the framebuffer's stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL_ATTACHMENT]]: Invalidates both the framebuffer's depth and stencil
    *     buffer.
    *
    * @example
    *   {{{
    * gl.invalidateFramebuffer(WebGL2RenderingContext.READ_FRAMEBUFFER, js.Array(
    *   WebGLRenderingContext.COLOR_ATTACHMENT0,
    *   WebGLRenderingContext.COLOR_ATTACHMENT1
    * ))
    *   }}}
    */
  def invalidateFramebuffer(target: Int, attachments: js.Array[Int]): Unit = js.native

  /** Invalidates portions of the contents of attachments in a framebuffer.
    *
    * @group Framebuffers
    * @param target
    *   An Int specifying the binding point (target). Possible values:
    *   - [[WebGLRenderingContext.FRAMEBUFFER]]: Collection buffer data storage of color, alpha, depth and stencil
    *     buffers used to render an image.
    *   - [[WebGL2RenderingContext$.DRAW_FRAMEBUFFER]]: Equivalent to [[WebGLRenderingContext.FRAMEBUFFER]].
    *   - [[WebGL2RenderingContext$.READ_FRAMEBUFFER]]: Used as a source for reading operations.
    * @param attachments
    *   An Array of Int specifying the attachment points to invalidate. Possible values:
    *   - [[WebGLRenderingContext.COLOR_ATTACHMENT0]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT1]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT2]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT3]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT4]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT5]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT6]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT7]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT8]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT9]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT10]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT11]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT12]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT13]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT14]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT15]]: Invalidates one of the framebuffer's color buffers.
    *   - [[WebGLRenderingContext.DEPTH_ATTACHMENT]]: Invalidates the framebuffer's depth buffer.
    *   - [[WebGLRenderingContext.STENCIL_ATTACHMENT]]: Invalidates the framebuffer's stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL_ATTACHMENT]]: Invalidates both the framebuffer's depth and stencil
    *     buffer.
    * @param x
    *   An Int specifying the left origin of the pixel rectangle to invalidate.
    * @param y
    *   An Int specifying the bottom origin of the pixel rectangle to invalidate.
    * @param width
    *   An Int specifying the width of the pixel rectangle to invalidate.
    * @param height
    *   An Int specifying the height of the pixel rectangle to invalidate.
    *
    * @example
    *   {{{
    * gl.invalidateSubFramebuffer(
    *   WebGL2RenderingContext.READ_FRAMEBUFFER,
    *   js.Array(WebGLRenderingContext.COLOR_ATTACHMENT0, WebGLRenderingContext.COLOR_ATTACHMENT1),
    *   0,
    *   0,
    *   256,
    *   256,
    * )
    *   }}}
    */
  def invalidateSubFramebuffer(
      target: Int, attachments: js.Array[Int], x: Int, y: Int, width: Int, height: Int
  ): Unit = js.native

  /** Selects a color buffer as the source for pixels.
    *
    * @group Framebuffers
    * @param source
    *   An Int specifying a color buffer. Possible values:
    *   - [[WebGLRenderingContext.BACK]]: Reads from the back color buffer.
    *   - [[WebGLRenderingContext.NONE]]: Reads from no color buffer.
    *   - [[WebGLRenderingContext.COLOR_ATTACHMENT0]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT1]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT2]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT3]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT4]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT5]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT6]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT7]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT8]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT9]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT10]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT11]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT12]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT13]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT14]]: Reads from one of the 16 color attachment buffers.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT15]]: Reads from one of the 16 color attachment buffers.
    * @example
    *   {{{
    * gl.readBuffer(WebGLRenderingContext.COLOR_ATTACHMENT0)
    *   }}}
    */
  def readBuffer(source: Int): Unit = js.native

  /** @groupname Renderbuffers Renderbuffers */
  /** Returns information about implementation-dependent support for internal formats.
    *
    * @group Renderbuffers
    * @param target
    *   An Int specifying the target renderbuffer object. Possible values:
    *   - [[WebGLRenderingContext.RENDERBUFFER]]: Buffer data storage for single images in a renderable internal format.
    * @param internalformat
    *   An Int specifying the internal format about which to retrieve information (must be a color-renderable,
    *   depth-renderable or stencil-renderable format).
    * @param pname
    *   An Int specifying the type of information to query. Possible values:
    *   - Int32Array containing sample counts supported for internalformat in descending order.
    * @return
    *   Depends on the requested information (as specified with pname). It is an Int32Array if pname is
    *   [[WebGLRenderingContext.SAMPLES]].
    * @example
    *   {{{
    * val samples = gl.getInternalformatParameter(
    *   WebGLRenderingContext.RENDERBUFFER,
    *   WebGLRenderingContext.RGBA8,
    *   WebGLRenderingContext.SAMPLES,
    * )
    *   }}}
    */
  def getInternalformatParameter(target: Int, internalformat: Int, pname: Int): js.Any = js.native

  /** Creates and initializes a renderbuffer object's data store and allows specifying the number of samples to be used.
    *
    * @group Renderbuffers
    * @param target
    *   An Int specifying the target renderbuffer object. Possible values:
    *   - [[WebGLRenderingContext.RENDERBUFFER]]: Buffer data storage for single images in a renderable internal format.
    * @param samples
    *   An Int specifying the number of samples to be used for the renderbuffer storage.
    * @param internalFormat
    *   An Int specifying the internal format of the renderbuffer. Possible values
    *   ([[WebGLRenderingContext.DEPTH_STENCIL]] is not supported):
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.R8I]]
    *   - [[WebGL2RenderingContext$.R16UI]]
    *   - [[WebGL2RenderingContext$.R16I]]
    *   - [[WebGL2RenderingContext$.R32UI]]
    *   - [[WebGL2RenderingContext$.R32I]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG8I]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG16I]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RG32I]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGBA4]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - [[WebGL2RenderingContext$.RGB10_A2]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8I]]
    *   - [[WebGL2RenderingContext$.RGB10_A2UI]]
    *   - [[WebGL2RenderingContext$.RGBA16UI]]
    *   - [[WebGL2RenderingContext$.RGBA16I]]
    *   - [[WebGL2RenderingContext$.RGBA32I]]
    *   - [[WebGL2RenderingContext$.RGBA32UI]]
    *   - [[WebGLRenderingContext.DEPTH_COMPONENT16]]
    *   - [[WebGL2RenderingContext$.DEPTH_COMPONENT24]]
    *   - [[WebGL2RenderingContext$.DEPTH_COMPONENT32F]]
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]
    *   - [[WebGL2RenderingContext$.DEPTH24_STENCIL8]]
    *   - [[WebGL2RenderingContext$.DEPTH32F_STENCIL8]]
    *   - [[WebGLRenderingContext.STENCIL_INDEX8]]
    * @param width
    *   An Int specifying the width of the renderbuffer in pixels.
    * @param height
    *   An Int specifying the height of the renderbuffer in pixels.
    * @example
    *   {{{
    * gl.renderbufferStorageMultisample(WebGLRenderingContext.RENDERBUFFER, 4, WebGLRenderingContext.RGBA4, 256, 256)
    *   }}}
    */
  def renderbufferStorageMultisample(
      target: Int, samples: Int, internalFormat: Int, width: Int, height: Int
  ): Unit = js.native

  /** @groupname Textures Textures */
  /** Specifies all levels of two-dimensional texture storage.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP]]: A cube-mapped texture.
    * @param levels
    *   An Int specifying the number of texture levels.
    * @param internalformat
    *   An Int specifying the texture store format. Possible values:
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - [[WebGLRenderingContext.RGBA4]]
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]] Unlike OpenGL 3.0, WebGL 2 doesn't support the following ETC2 and EAC
    *     compressed texture formats (see section 5.37 in the WebGL 2 spec). You might be able to enable them via the
    *     WEBGL_compressed_texture_etc extension, though.
    *   - COMPRESSED_R11_EAC
    *   - COMPRESSED_SIGNED_R11_EAC
    *   - COMPRESSED_RG11_EAC
    *   - COMPRESSED_SIGNED_RG11_EAC
    *   - COMPRESSED_RGB8_ETC2
    *   - COMPRESSED_RGBA8_ETC2_EAC
    *   - COMPRESSED_SRGB8_ETC2
    *   - COMPRESSED_SRGB8_ALPHA8_ETC2_EAC
    *   - COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2
    *   - COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @example
    *   {{{
    * gl.texStorage2D(WebGLRenderingContext.TEXTURE_2D, 1, WebGL2RenderingContext.RGB8, 256, 256)
    *   }}}
    */
  def texStorage2D(
      target: Int, levels: Int, internalformat: Int, width: Int, height: Int
  ): Unit = js.native

  /** Specifies all levels of a three-dimensional texture or two-dimensional array texture.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param levels
    *   An Int specifying the number of texture levels.
    * @param internalformat
    *   An Int specifying the texture store format. Possible values:
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]] In addition if the WEBGL_compressed_texture_etc extension is supported,
    *     the following values are also possible:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @example
    *   {{{
    * gl.texStorage3D(WebGL2RenderingContext.TEXTURE_3D, 1, WebGL2RenderingContext.RGB8, 256, 256, 256)
    *   }}}
    */
  def texStorage3D(
      target: Int, levels: Int, internalformat: Int, width: Int, height: Int, depth: Int
  ): Unit = js.native

  /** Specifies a three-dimensional texture image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the color components in the texture. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param format
    *   An Int specifying the format of the texel data. The correct combinations with internalformat are listed in this
    *   table:
    *   [[https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE]].
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)]]
    * @param offset
    *   An Int byte offset into the [[WebGLBuffer]]'s data store. Used to upload data to the currently bound
    *   [[WebGLTexture]] from the [[WebGLBuffer]] bound to the [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]] target.
    */
  def texImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int,
      typ: Int, offset: Double
  ): Unit = js.native

  /** Specifies a three-dimensional texture image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the color components in the texture. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param format
    *   An Int specifying the format of the texel data. The correct combinations with internalformat are listed in this
    *   table:
    *   [[https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE]].
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)]]
    * @param source
    *   One of the following objects can be used as a pixel source for the texture:
    *   - [[ImageBitmap]]
    *   - [[ImageData]]
    *   - [[HTMLImageElement]]
    *   - [[HTMLCanvasElement]]
    *   - [[HTMLVideoElement]]
    */
  def texImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int,
      typ: Int, source: ImageBitmap
  ): Unit = js.native

  /** Specifies a three-dimensional texture image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the color components in the texture. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param format
    *   An Int specifying the format of the texel data. The correct combinations with internalformat are listed in this
    *   table:
    *   [[https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE]].
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)]]
    * @param source
    *   One of the following objects can be used as a pixel source for the texture:
    *   - [[ImageBitmap]]
    *   - [[ImageData]]
    *   - [[HTMLImageElement]]
    *   - [[HTMLCanvasElement]]
    *   - [[HTMLVideoElement]]
    */
  def texImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int,
      typ: Int, source: ImageData
  ): Unit = js.native

  /** Specifies a three-dimensional texture image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the color components in the texture. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param format
    *   An Int specifying the format of the texel data. The correct combinations with internalformat are listed in this
    *   table:
    *   [[https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE]].
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)]]
    * @param source
    *   One of the following objects can be used as a pixel source for the texture:
    *   - [[ImageBitmap]]
    *   - [[ImageData]]
    *   - [[HTMLImageElement]]
    *   - [[HTMLCanvasElement]]
    *   - [[HTMLVideoElement]]
    */
  def texImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int,
      typ: Int, source: HTMLImageElement
  ): Unit = js.native

  /** Specifies a three-dimensional texture image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the color components in the texture. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param format
    *   An Int specifying the format of the texel data. The correct combinations with internalformat are listed in this
    *   table:
    *   [[https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE]].
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)]]
    * @param source
    *   One of the following objects can be used as a pixel source for the texture:
    *   - [[ImageBitmap]]
    *   - [[ImageData]]
    *   - [[HTMLImageElement]]
    *   - [[HTMLCanvasElement]]
    *   - [[HTMLVideoElement]]
    */
  def texImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int,
      typ: Int, source: HTMLCanvasElement
  ): Unit = js.native

  /** Specifies a three-dimensional texture image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the color components in the texture. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param format
    *   An Int specifying the format of the texel data. The correct combinations with internalformat are listed in this
    *   table:
    *   [[https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE]].
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)]]
    * @param source
    *   One of the following objects can be used as a pixel source for the texture:
    *   - [[ImageBitmap]]
    *   - [[ImageData]]
    *   - [[HTMLImageElement]]
    *   - [[HTMLCanvasElement]]
    *   - [[HTMLVideoElement]]
    */
  def texImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int,
      typ: Int, source: HTMLVideoElement
  ): Unit = js.native

  /** Specifies a three-dimensional texture image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the color components in the texture. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param format
    *   An Int specifying the format of the texel data. The correct combinations with internalformat are listed in this
    *   table:
    *   [[https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE]].
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)]]
    * @param srcData
    *   A TypedArray object.
    * @example
    *   {{{
    * gl.texImage3D(
    *   WebGL2RenderingContext.TEXTURE_3D,
    *   0, // level
    *   WebGLRenderingContext.RGBA, // internalFormat
    *   1, // width
    *   1, // height
    *   1, // depth
    *   0, // border
    *   WebGLRenderingContext.RGBA, // format
    *   WebGLRenderingContext.UNSIGNED_BYTE, // type
    *   Uint8Array(js.Array(0xff, 0x00, 0x00, 0x00)), // data
    * )
    *   }}}
    */
  def texImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int,
      typ: Int, srcData: TypedArray[js.Any, js.Any]
  ): Unit = js.native

  /** Specifies a three-dimensional texture image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the color components in the texture. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param format
    *   An Int specifying the format of the texel data. The correct combinations with internalformat are listed in this
    *   table:
    *   [[https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE]].
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)]]
    * @param srcData
    *   A DataView object.
    */
  def texImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int,
      typ: Int, srcData: DataView
  ): Unit = js.native

  /** Specifies a three-dimensional texture image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the color components in the texture. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param format
    *   An Int specifying the format of the texel data. The correct combinations with internalformat are listed in this
    *   table:
    *   [[https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE]].
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)]]
    * @param srcData
    *   A TypedArray object.
    * @param srcOffset
    *   A Double byte offset into the srcData.
    */
  def texImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int,
      typ: Int, srcData: TypedArray[js.Any, js.Any], srcOffset: Double
  ): Unit = js.native

  /** Specifies a three-dimensional texture image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the color components in the texture. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param format
    *   An Int specifying the format of the texel data. The correct combinations with internalformat are listed in this
    *   table:
    *   [[https://www.khronos.org/registry/webgl/specs/latest/2.0/#TEXTURE_TYPES_FORMATS_FROM_DOM_ELEMENTS_TABLE]].
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV (pixels must be null)]]
    * @param srcData
    *   A DataView object.
    * @param srcOffset
    *   A Double byte offset into the srcData.
    */
  def texImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, format: Int,
      typ: Int, srcData: DataView, srcOffset: Double
  ): Unit = js.native

  /** Specifies a sub-rectangle of the current 3D texture.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the texture image.
    * @param yoffset
    *   An Int specifying the y offset within the texture image.
    * @param zoffset
    *   An Int specifying the z offset within the texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the format of the texel data. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV]] (pixels must be null)
    * @param pixels
    *   One of the following objects can be used as a pixel source for the texture:
    *   - Uint8Array (must be used if type is [[WebGLRenderingContext.UNSIGNED_BYTE]])
    *   - Uint16Array (must be used if type is either [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]],
    *     [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]], [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]], or
    *     [[WebGL2RenderingContext$.HALF_FLOAT]])
    *   - Float32Array (must be used if type is [[WebGLRenderingContext.FLOAT]])
    *   - [[ImageBitmap]]
    *   - [[ImageData]]
    *   - [[HTMLImageElement]]
    *   - [[HTMLCanvasElement]]
    *   - [[HTMLVideoElement]]
    * @example
    *   {{{
    * gl.texSubImage3D(
    *   WebGL2RenderingContext.TEXTURE_3D,
    *   0,
    *   0,
    *   0,
    *   0,
    *   image.width,
    *   image.height,
    *   1,
    *   WebGLRenderingContext.RGBA,
    *   WebGLRenderingContext.UNSIGNED_BYTE,
    *   image,
    * )
    *   }}}
    */
  def texSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, typ: Int, pixels: Int
  ): Unit = js.native

  /** Specifies a sub-rectangle of the current 3D texture.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the texture image.
    * @param yoffset
    *   An Int specifying the y offset within the texture image.
    * @param zoffset
    *   An Int specifying the z offset within the texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the format of the texel data. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV]] (pixels must be null)
    * @param offset
    *   An Int byte offset into the [[WebGLBuffer]]'s data store. Used to upload data to the currently bound
    *   [[WebGLTexture]] from the [[WebGLBuffer]] bound to the [[PIXEL_UNPACK_BUFFER]] target.
    */
  def texSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, typ: Int, offset: Double
  ): Unit = js.native

  /** Specifies a sub-rectangle of the current 3D texture.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the texture image.
    * @param yoffset
    *   An Int specifying the y offset within the texture image.
    * @param zoffset
    *   An Int specifying the z offset within the texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the format of the texel data. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV]] (pixels must be null)
    * @param srcData
    *   A TypedArray object.
    */
  def texSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, typ: Int, srcData: TypedArray[js.Any, js.Any]
  ): Unit = js.native

  /** Specifies a sub-rectangle of the current 3D texture.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the texture image.
    * @param yoffset
    *   An Int specifying the y offset within the texture image.
    * @param zoffset
    *   An Int specifying the z offset within the texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the format of the texel data. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV]] (pixels must be null)
    * @param srcData
    *   A DataView object.
    */
  def texSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, typ: Int, srcData: DataView
  ): Unit = js.native

  /** Specifies a sub-rectangle of the current 3D texture.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the texture image.
    * @param yoffset
    *   An Int specifying the y offset within the texture image.
    * @param zoffset
    *   An Int specifying the z offset within the texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the format of the texel data. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV]] (pixels must be null)
    * @param srcData
    *   A TypedArray object.
    * @param srcOffset
    *   A Double byte offset into the srcData.
    */
  def texSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, typ: Int, srcData: TypedArray[js.Any, js.Any], srcOffset: Double
  ): Unit = js.native

  /** Specifies a sub-rectangle of the current 3D texture.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the texture image.
    * @param yoffset
    *   An Int specifying the y offset within the texture image.
    * @param zoffset
    *   An Int specifying the z offset within the texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the format of the texel data. Possible values:
    *   - [[WebGLRenderingContext.ALPHA]]: Discards the red, green and blue components and reads the alpha component.
    *   - [[WebGLRenderingContext.RGB]]: Discards the alpha components and reads the red, green and blue components.
    *   - [[WebGLRenderingContext.RGBA]]: Red, green, blue and alpha components are read from the color buffer.
    *   - [[WebGLRenderingContext.LUMINANCE]]: Each color component is a luminance component, alpha is 1.0.
    *   - [[WebGLRenderingContext.LUMINANCE_ALPHA]]: Each component is a luminance/alpha component.
    *   - [[WebGL2RenderingContext$.R8]]
    *   - [[WebGL2RenderingContext$.R16F]]
    *   - [[WebGL2RenderingContext$.R32F]]
    *   - [[WebGL2RenderingContext$.R8UI]]
    *   - [[WebGL2RenderingContext$.RG8]]
    *   - [[WebGL2RenderingContext$.RG16F]]
    *   - [[WebGL2RenderingContext$.RG32F]]
    *   - [[WebGL2RenderingContext$.RG8UI]]
    *   - [[WebGL2RenderingContext$.RG16UI]]
    *   - [[WebGL2RenderingContext$.RG32UI]]
    *   - [[WebGL2RenderingContext$.RGB8]]
    *   - [[WebGL2RenderingContext$.SRGB8]]
    *   - [[WebGLRenderingContext.RGB565]]
    *   - [[WebGL2RenderingContext$.R11F_G11F_B10F]]
    *   - [[WebGL2RenderingContext$.RGB9_E5]]
    *   - [[WebGL2RenderingContext$.RGB16F]]
    *   - [[WebGL2RenderingContext$.RGB32F]]
    *   - [[WebGL2RenderingContext$.RGB8UI]]
    *   - [[WebGL2RenderingContext$.RGBA8]]
    *   - [[WebGL2RenderingContext$.SRGB8_ALPHA8]]
    *   - [[WebGLRenderingContext.RGB5_A1]]
    *   - RGBA4444
    *   - [[WebGL2RenderingContext$.RGBA16F]]
    *   - [[WebGL2RenderingContext$.RGBA32F]]
    *   - [[WebGL2RenderingContext$.RGBA8UI]]
    * @param typ
    *   An Int specifying the data type of the texel data. Possible values:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]: 8 bits per channel for [[WebGLRenderingContext.RGBA]].
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_6_5]]: 5 red bits, 6 green bits, 5 blue bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_4_4_4_4]]: 4 red bits, 4 green bits, 4 blue bits, 4 alpha bits.
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT_5_5_5_1]]: 5 red bits, 5 green bits, 5 blue bits, 1 alpha bit.
    *   - [[WebGLRenderingContext.BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    *   - [[WebGLRenderingContext.INT]]
    *   - [[WebGL2RenderingContext$.HALF_FLOAT]]
    *   - [[WebGLRenderingContext.FLOAT]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_2_10_10_10_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_10F_11F_11F_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_5_9_9_9_REV]]
    *   - [[WebGL2RenderingContext$.UNSIGNED_INT_24_8]]
    *   - [[WebGL2RenderingContext$.FLOAT_32_UNSIGNED_INT_24_8_REV]] (pixels must be null)
    * @param srcData
    *   A DataView object.
    * @param srcOffset
    *   A Double byte offset into the srcData.
    */
  def texSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, typ: Int, srcData: DataView, srcOffset: Double
  ): Unit = js.native

  /** Copies pixels from the current [[WebGLFramebuffer]] into an existing 3D texture sub-image.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the texture image.
    * @param yoffset
    *   An Int specifying the y offset within the texture image.
    * @param zoffset
    *   An Int specifying the z offset within the texture image.
    * @param x
    *   An Int specifying the x coordinate of the lower left corner where to start copying.
    * @param y
    *   An Int specifying the y coordinate of the lower left corner where to start copying.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @example
    *   {{{
    * gl.copyTexSubImage3D(WebGL2RenderingContext.TEXTURE_3D, 0, 0, 0, 0, 0, 0, 16, 16)
    *   }}}
    */
  def copyTexSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, x: Int, y: Int, width: Int, height: Int
  ): Unit = js.native

  /** Specifies a two-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    *
    * @param width
    *   An Int specifying the width of the texture.
    *
    * @param height
    *   An Int specifying the height of the texture.
    *
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    *
    * @param imageSize
    *   An Int specifying the number of bytes to read from the buffer bound to
    *   [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]].
    *
    * @param offset
    *   An Int specifying the offset in bytes from which to read from the buffer bound to
    *   [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]].
    */
  def compressedTexImage2D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, imageSize: Int, offset: Int
  ): Unit = js.native

  /** Specifies a two-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A DataView object.
    */
  def compressedTexImage2D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int,
      srcData: TypedArray[js.Any, js.Any]
  ): Unit = js.native

  /** Specifies a two-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A TypedArray object.
    */
  def compressedTexImage2D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, srcData: DataView
  ): Unit = js.native

  /** Specifies a two-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A TypedArray object.
    */
  def compressedTexImage2D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int,
      srcData: TypedArray[js.Any, js.Any], srcOffset: Double
  ): Unit = js.native

  /** Specifies a two-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A DataView object.
    */
  def compressedTexImage2D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, srcData: DataView,
      srcOffset: Double
  ): Unit = js.native

  /** Specifies a two-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A TypedArray object.
    */
  def compressedTexImage2D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int,
      srcData: TypedArray[js.Any, js.Any], srcOffset: Double, srcLengthOverride: Int
  ): Unit = js.native

  /** Specifies a two-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A DataView object.
    */
  def compressedTexImage2D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, srcData: DataView,
      srcOffset: Double, srcLengthOverride: Int
  ): Unit = js.native

  /** Specifies a three-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    *
    * @param width
    *   An Int specifying the width of the texture.
    *
    * @param height
    *   An Int specifying the height of the texture.
    *
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    *
    * @param imageSize
    *   An Int specifying the number of bytes to read from the buffer bound to
    *   [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]].
    *
    * @param offset
    *   An Int specifying the offset in bytes from which to read from the buffer bound to
    *   [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]].
    */
  def compressedTexImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, imageSize: Int,
      offset: Int
  ): Unit = js.native

  /** Specifies a three-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A TypedArray object.
    */
  def compressedTexImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int,
      srcData: TypedArray[js.Any, js.Any]
  ): Unit = js.native

  /** Specifies a three-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A DataView object.
    */
  def compressedTexImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, srcData: DataView
  ): Unit = js.native

  /** Specifies a three-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    *
    * @param width
    *   An Int specifying the width of the texture.
    *
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A TypedArray object.
    */
  def compressedTexImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int,
      srcData: TypedArray[js.Any, js.Any], srcOffset: Double
  ): Unit = js.native

  /** Specifies a three-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    *
    * @param width
    *   An Int specifying the width of the texture.
    *
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A DataView object.
    */
  def compressedTexImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, srcData: DataView,
      srcOffset: Double
  ): Unit = js.native

  /** Specifies a three-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A TypedArray object.
    */
  def compressedTexImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int,
      srcData: TypedArray[js.Any, js.Any], srcOffset: Double, srcLengthOverride: Int
  ): Unit = js.native

  /** Specifies a three-dimensional texture image in a compressed format. Compressed image formats must be enabled by
    * WebGL extensions before using this method.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values for compressedTexImage2D:
    *   - [[WebGLRenderingContext.TEXTURE_2D]]: A two-dimensional texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_X]]: Positive X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_X]]: Negative X face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Y]]: Positive Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Y]]: Negative Y face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_POSITIVE_Z]]: Positive Z face for a cube-mapped texture.
    *   - [[WebGLRenderingContext.TEXTURE_CUBE_MAP_NEGATIVE_Z]]: Negative Z face for a cube-mapped texture.
    *
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    *
    * @param internalformat
    *   An Int specifying the compressed image format. Compressed image formats must be enabled by WebGL extensions
    *   before using this method. All values are possible for compressedTexImage2D. See compressed texture formats for
    *   which are valid for compressedTexImage3D. Possible values:
    *
    * When using the WEBGL_compressed_texture_s3tc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TC.COMPRESSED_RGBA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_s3tc_srgb extension:
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT1_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT3_EXT]]
    *   - [[webgl.extensions.WebGLCompressedTextureS3TCSRGB.COMPRESSED_SRGB_ALPHA_S3TC_DXT5_EXT]]
    *
    * When using the WEBGL_compressed_texture_etc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * When using the WEBGL_compressed_texture_pVRTC extension:
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGB_PVRTC_2BPPV1_IMG]]
    *   - [[webgl.extensions.WebGLCompressedTexturePVRTC.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG]]
    *
    * When using the WEBGL_compressed_texture_etc1 extension:
    *   - [[webgl.extensions.WEBGLCompressedTextureETC1.COMPRESSED_RGB_ETC1_WEBGL]]
    *
    * When using the WEBGL_compressed_texture_astc extension:
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_RGBA_ASTC_12x12_KHR]]
    *   - [[webgl.extensions.WebGLCompressedTextureASTC.COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR]]
    *
    * When using the EXT_texture_compression_bptc extension:
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGBA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionBPTC.COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT]]
    *
    * When using the EXT_texture_compression_rgtc extension:
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_RGTC1_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_RED_GREEN_RGTC2_EXT]]
    *   - [[webgl.extensions.EXTTextureCompressionRGTC.COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT]]
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param border
    *   An Int specifying the width of the border. Must be 0.
    * @param srcData
    *   A TypedArray object.
    */
  def compressedTexImage3D(
      target: Int, level: Int, internalformat: Int, width: Int, height: Int, depth: Int, border: Int, srcData: DataView,
      srcOffset: Double, srcLengthOverride: Int
  ): Unit = js.native

  /** Specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the compressed texture image.
    * @param yoffset
    *   An Int specifying the y offset within the compressed texture image.
    * @param zoffset
    *   An Int specifying the z offset within the compressed texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the compressed image format. Possible values:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    * @param imageSize
    *   An Int specifying the number of bytes to read from the buffer bound to
    *   [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]].
    * @param offset
    *   An Int specifying the offset in bytes from which to read from the buffer bound to
    *   [[WebGL2RenderingContext$.PIXEL_UNPACK_BUFFER]].
    */
  def compressedTexSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, imageSize: Int, offset: Int
  ): Unit = js.native

  /** Specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the compressed texture image.
    * @param yoffset
    *   An Int specifying the y offset within the compressed texture image.
    * @param zoffset
    *   An Int specifying the z offset within the compressed texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the compressed image format. Possible values:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    * @param srcData
    *   A TypedArray object that will be used as a data store for the compressed image data in memory.
    */
  def compressedTexSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, srcData: TypedArray[js.Any, js.Any]
  ): Unit = js.native

  /** Specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the compressed texture image.
    * @param yoffset
    *   An Int specifying the y offset within the compressed texture image.
    * @param zoffset
    *   An Int specifying the z offset within the compressed texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the compressed image format. Possible values:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    * @param srcData
    *   A DataView object that will be used as a data store for the compressed image data in memory.
    */
  def compressedTexSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, srcData: DataView
  ): Unit = js.native

  /** Specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the compressed texture image.
    * @param yoffset
    *   An Int specifying the y offset within the compressed texture image.
    * @param zoffset
    *   An Int specifying the z offset within the compressed texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the compressed image format. Possible values:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    * @param srcData
    *   A TypedArray object that will be used as a data store for the compressed image data in memory.
    */
  def compressedTexSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, srcData: TypedArray[js.Any, js.Any], srcOffset: Double
  ): Unit = js.native

  /** Specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the compressed texture image.
    * @param yoffset
    *   An Int specifying the y offset within the compressed texture image.
    * @param zoffset
    *   An Int specifying the z offset within the compressed texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the compressed image format. Possible values:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    * @param srcData
    *   A DataView object that will be used as a data store for the compressed image data in memory.
    */
  def compressedTexSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, srcData: DataView, srcOffset: Double
  ): Unit = js.native

  /** Specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the compressed texture image.
    * @param yoffset
    *   An Int specifying the y offset within the compressed texture image.
    * @param zoffset
    *   An Int specifying the z offset within the compressed texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the compressed image format. Possible values:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * @param srcData
    *   A TypedArray object that will be used as a data store for the compressed image data in memory.
    */
  def compressedTexSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, srcData: TypedArray[js.Any, js.Any], srcOffset: Double, srcLengthOverride: Int
  ): Unit = js.native

  /** Specifies a three-dimensional sub-rectangle for a texture image in a compressed format.
    *
    * @group Textures
    * @param target
    *   An Int specifying the binding point (target) of the active texture. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_3D]]: A three-dimensional texture.
    *   - [[WebGL2RenderingContext$.TEXTURE_2D_ARRAY]]: A two-dimensional array texture.
    * @param level
    *   An Int specifying the level of detail. Level 0 is the base image level and level n is the n-th mipmap reduction
    *   level.
    * @param xoffset
    *   An Int specifying the x offset within the compressed texture image.
    * @param yoffset
    *   An Int specifying the y offset within the compressed texture image.
    * @param zoffset
    *   An Int specifying the z offset within the compressed texture image.
    * @param width
    *   An Int specifying the width of the texture.
    * @param height
    *   An Int specifying the height of the texture.
    * @param depth
    *   An Int specifying the depth of the texture.
    * @param format
    *   An Int specifying the compressed image format. Possible values:
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_R11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SIGNED_RG11_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGBA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_ALPHA8_ETC2_EAC]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *   - [[webgl.extensions.WebGLCompressedTextureETC.COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2]]
    *
    * @param srcData
    *   A DataView object that will be used as a data store for the compressed image data in memory.
    */
  def compressedTexSubImage3D(
      target: Int, level: Int, xoffset: Int, yoffset: Int, zoffset: Int, width: Int, height: Int, depth: Int,
      format: Int, srcData: DataView, srcOffset: Double, srcLengthOverride: Int
  ): Unit = js.native

  /** @groupname Programs_and_shaders Programs and shaders */
  /** Returns the binding of color numbers to user-defined varying out variables.
    *
    * @group Programs_and_shaders
    * @param program
    *   A [[WebGLProgram]] to query.
    * @param name
    *   A string specifying the name of the user-defined varying out variable.
    * @return
    *   An Int indicating the assigned color number binding, or -1 otherwise.
    * @example
    *   {{{
    * // program is a linked WebGLProgram
    * gl.getFragDataLocation(program, "fragColor")
    *   }}}
    */
  def getFragDataLocation(program: WebGLProgram, name: String): Int = js.native

  /** @groupname Uniforms_and_attributes Uniforms and attributes */
  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param v0
    *   An Int to be used for the uniform variable.
    */
  def uniform1ui(location: WebGLUniformLocation, v0: Int): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param v0
    *   An Int to be used for the uniform variable.
    * @param v1
    *   An Int to be used for the uniform variable.
    */
  def uniform2ui(location: WebGLUniformLocation, v0: Int, v1: Int): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param v0
    *   An Int to be used for the uniform variable.
    * @param v1
    *   An Int to be used for the uniform variable.
    * @param v2
    *   An Int to be used for the uniform variable.
    */
  def uniform3ui(location: WebGLUniformLocation, v0: Int, v1: Int, v2: Int): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param v0
    *   An Int to be used for the uniform variable.
    * @param v1
    *   An Int to be used for the uniform variable.
    * @param v2
    *   An Int to be used for the uniform variable.
    * @param v3
    *   An Int to be used for the uniform variable.
    */
  def uniform4ui(location: WebGLUniformLocation, v0: Int, v1: Int, v2: Int, v3: Int): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Float32Array to be used for the uniform variable.
    */
  def uniform1fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Float32Array to be used for the uniform variable.
    */
  def uniform1fv(
      location: WebGLUniformLocation, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Float32Array to be used for the uniform variable.
    */
  def uniform2fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Float32Array to be used for the uniform variable.
    */
  def uniform2fv(
      location: WebGLUniformLocation, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Float32Array to be used for the uniform variable.
    */
  def uniform3fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Float32Array to be used for the uniform variable.
    */
  def uniform3fv(
      location: WebGLUniformLocation, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Float32Array to be used for the uniform variable.
    */
  def uniform4fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Float32Array to be used for the uniform variable.
    */
  def uniform4fv(
      location: WebGLUniformLocation, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   An Int32Array to be used for the uniform variable.
    */
  def uniform1iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   An Int32Array to be used for the uniform variable.
    */
  def uniform1iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double, srcLength: Int): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   An Int32Array to be used for the uniform variable.
    */
  def uniform2iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   An Int32Array to be used for the uniform variable.
    */
  def uniform2iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double, srcLength: Int): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   An Int32Array to be used for the uniform variable.
    */
  def uniform3iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   An Int32Array to be used for the uniform variable.
    */
  def uniform3iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double, srcLength: Int): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   An Int32Array to be used for the uniform variable.
    */
  def uniform4iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   An Int32Array to be used for the uniform variable.
    */
  def uniform4iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double, srcLength: Int): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform1uiv(location: WebGLUniformLocation, data: Uint32Array): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform1uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform1uiv(
      location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform2uiv(location: WebGLUniformLocation, data: Uint32Array): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform2uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform2uiv(
      location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform3uiv(location: WebGLUniformLocation, data: Uint32Array): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform3uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform3uiv(
      location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform4uiv(location: WebGLUniformLocation, data: Uint32Array): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform4uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double): Unit = js.native

  /** Method specifying values of uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param data
    *   A Uint32Array to be used for the uniform variable.
    */
  def uniform4uiv(
      location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix2fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix2fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix3x2fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix3x2fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix3x2fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix4x2fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix4x2fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix4x2fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix2x3fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix2x3fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix2x3fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix3fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix3fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix4x3fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix4x3fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix4x3fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix2x4fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix2x4fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix2x4fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix3x4fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix3x4fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix3x4fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix4fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double
  ): Unit = js.native

  /** Method specifying matrix values for uniform variables.
    *
    * @group Uniforms_and_attributes
    * @param location
    *   A [[WebGLUniformLocation]] object containing the location of the uniform attribute to modify.
    *
    * @param transpose
    *   A Boolean specifying whether to transpose the matrix. Must be false.
    *
    * @param data
    *   A Float32Array of float values.
    */
  def uniformMatrix4fv(
      location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Int
  ): Unit = js.native

  /** Specifies integer values for generic vertex attributes.
    *
    * @group Uniforms_and_attributes
    * @param index
    *   An Int specifying the position of the vertex attribute to be modified.
    *
    * @param v0
    *   An Int for the vertex attribute value.
    * @param v1
    *   An Int for the vertex attribute value.
    * @param v2
    *   An Int for the vertex attribute value.
    * @param v3
    *   An Int for the vertex attribute value.
    */
  def vertexAttribI4i(index: Int, v0: Int, v1: Int, v2: Int, v3: Int): Unit = js.native

  /** Specifies integer values for generic vertex attributes.
    *
    * @group Uniforms_and_attributes
    * @param index
    *   An Int specifying the position of the vertex attribute to be modified.
    *
    * @param v0
    *   An Int for the vertex attribute value.
    * @param v1
    *   An Int for the vertex attribute value.
    * @param v2
    *   An Int for the vertex attribute value.
    * @param v3
    *   An Int for the vertex attribute value.
    */
  def vertexAttribI4ui(index: Int, v0: Int, v1: Int, v2: Int, v3: Int): Unit = js.native

  /** Specifies integer values for generic vertex attributes.
    *
    * @group Uniforms_and_attributes
    * @param index
    *   An Int specifying the position of the vertex attribute to be modified.
    *
    * @param value
    *   A Int32Array or sequences of Int for integer vector vertex attribute values.
    */
  def vertexAttribI4iv(index: Int, value: Int32Array): Unit = js.native

  /** Specifies integer values for generic vertex attributes.
    *
    * @group Uniforms_and_attributes
    * @param index
    *   An Int specifying the position of the vertex attribute to be modified.
    *
    * @param value
    *   A Uint32Array or sequences of Int for integer vector vertex attribute values.
    */
  def vertexAttribI4uiv(index: Int, value: Uint32Array): Unit = js.native

  /** Specifies integer data formats and locations of vertex attributes in a vertex attributes array.
    *
    * Very similar to [[WebGLRenderingContext.vertexAttribPointer]]. The main difference is that while values specified
    * by vertexAttribPointer are always interpreted as floating-point values in the shader (even if they were originally
    * specified as integers in the buffer), this method allows specifying values which are interpreted as integers in
    * the shader.
    *
    * @group Uniforms_and_attributes
    * @param index
    *   An Int specifying the index of the vertex attribute that is to be modified.
    * @param size
    *   An Int specifying the number of components per vertex attribute. Must be 1, 2, 3, or 4.
    * @param typ
    *   An Int specifying the data type of each component in the array. Must be one of: [[WebGLRenderingContext.BYTE]],
    *   [[WebGLRenderingContext.UNSIGNED_BYTE]], [[WebGLRenderingContext.SHORT]],
    *   [[WebGLRenderingContext.UNSIGNED_SHORT]], [[WebGLRenderingContext.INT]], or
    *   [[WebGLRenderingContext.UNSIGNED_INT]].
    * @param stride
    *   An Int specifying the offset in bytes between the beginning of consecutive vertex attributes.
    * @param offset
    *   An Int specifying an offset in bytes of the first component in the vertex attribute array. Must be a multiple of
    *   type.
    * @example
    *   Linear Blend Skinning
    *   {{{
    * //Describe the layout of the buffer:
    * //1. position
    * gl.vertexAttribPointer(0, 3, WebGLRenderingContext.FLOAT, false, 20, 0)
    * gl.enableVertexAttribArray(0)
    * //2. bone weights, normalized to [0, 1]
    * gl.vertexAttribPointer(1, 4, WebGLRenderingContext.UNSIGNED_BYTE, true, 20, 12)
    * gl.enableVertexAttribArray(1)
    * //3. bone indices, interpreted as integer
    * gl.vertexAttribIPointer(2, 4, WebGLRenderingContext.UNSIGNED_BYTE, 20, 16)
    * gl.enableVertexAttribArray(2)
    *
    * //Connect to attributes from the vertex shader
    * gl.bindAttribLocation(shaderProgram, 0, "position")
    * gl.bindAttribLocation(shaderProgram, 1, "boneWeights")
    * gl.bindAttribLocation(shaderProgram, 2, "boneIndices")
    *
    * //Compile shader
    * val shader = gl.createShader(WebGLRenderingContext.VERTEX_SHADER)
    * gl.shaderSource(shader,
    * """#version 300 es
    *
    * uniform mat4 mvMatrix;
    * uniform mat4 bones[120];
    *
    * in vec3 position;
    * in vec4 boneWeights;
    * in uvec4 boneIndices;//read as 4-component unsigned integer
    *
    * void main() {
    *     vec4 skinnedPosition =
    *         bones[boneIndices.s] * vec4(position, 1.0) * boneWeights.s +
    *         bones[boneIndices.t] * vec4(position, 1.0) * boneWeights.t +
    *         bones[boneIndices.p] * vec4(position, 1.0) * boneWeights.p +
    *         bones[boneIndices.q] * vec4(position, 1.0) * boneWeights.q;
    *     gl_Position = mvMatrix * skinnedPosition;
    * }
    * """)
    * gl.compileShader(shader)
    *   }}}
    */
  def vertexAttribIPointer(index: Int, size: Int, typ: Int, stride: Int, offset: Int): Unit = js.native

  /** @groupname Drawing_buffers Drawing buffers */
  /** Modifies the rate at which generic vertex attributes advance when rendering multiple instances of primitives with
    * WebGL2RenderingContext.drawArraysInstanced and WebGL2RenderingContext.drawElementsInstanced.
    *
    * Note: When using WebGL 1, the ANGLE_instanced_arrays extension can provide this method, too.
    *
    * @group Drawing_buffers
    * @param index
    *   An Int specifying the index of the generic vertex attributes.
    * @param divisor
    *   An Int specifying the number of instances that will pass between updates of the generic attribute.
    * @example
    *   {{{
    * gl.vertexAttribDivisor(0, 2)
    *   }}}
    */
  def vertexAttribDivisor(index: Int, divisor: Int): Unit = js.native

  /** Renders primitives from array data. In addition, it can execute multiple instances of the range of elements.
    *
    * Note: When using WebGL 1, the ANGLE_instanced_arrays extension can provide this method, too.
    *
    * @group Drawing_buffers
    * @param mode
    *   An Int specifying the type primitive to render. Possible values are:
    *   - [[WebGLRenderingContext.POINTS]]: Draws a single dot.
    *   - [[WebGLRenderingContext.LINE_STRIP]]: Draws a straight line to the next vertex.
    *   - [[WebGLRenderingContext.LINE_LOOP]]: Draws a straight line to the next vertex, and connects the last vertex
    *     back to the first.
    *   - [[WebGLRenderingContext.LINES]]: Draws a line between a pair of vertices.
    *   - [[WebGLRenderingContext.TRIANGLE_STRIP]]
    *   - [[WebGLRenderingContext.TRIANGLE_FAN]]
    *   - [[WebGLRenderingContext.TRIANGLES]]: Draws a triangle for a group of three vertices.
    * @param first
    *   An Int specifying the starting index in the array of vector points.
    * @param count
    *   An Int specifying the number of indices to be rendered.
    * @param instanceCount
    *   An Int specifying the number of instances of the range of elements to execute.
    * @example
    *   {{{
    * gl.drawArraysInstanced(WebGLRenderingContext.POINTS, 0, 8, 4)
    *   }}}
    */
  def drawArraysInstanced(mode: Int, first: Int, count: Int, instanceCount: Int): Unit = js.native

  /** Renders primitives from array data. In addition, it can execute multiple instances of a set of elements.
    *
    * Note: When using WebGL 1, the ANGLE_instanced_arrays extension can provide this method, too.
    *
    * @group Drawing_buffers
    * @param mode
    *   An Int specifying the type primitive to render. Possible values are:
    *   - [[WebGLRenderingContext.POINTS]]: Draws a single dot.
    *   - [[WebGLRenderingContext.LINE_STRIP]]: Draws a straight line to the next vertex.
    *   - [[WebGLRenderingContext.LINE_LOOP]]: Draws a straight line to the next vertex, and connects the last vertex
    *     back to the first.
    *   - [[WebGLRenderingContext.LINES]]: Draws a line between a pair of vertices.
    *   - [[WebGLRenderingContext.TRIANGLE_STRIP]]
    *   - [[WebGLRenderingContext.TRIANGLE_FAN]]
    *   - [[WebGLRenderingContext.TRIANGLES]]: Draws a triangle for a group of three vertices.
    * @param count
    *   An Int specifying the number of elements to be rendered.
    * @param typ
    *   An Int specifying the type of the values in the element array buffer. Possible values are:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]] When using the OES_element_index_uint extension.
    * @param offset
    *   An Int specifying an offset in the element array buffer. Must be a valid multiple of the size of the given type.
    * @param instanceCount
    *   An Int specifying the number of instances of the set of elements to execute.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   If mode is not one of the accepted values
    * @throws WebGLRenderingContext.INVALID_OPERATION
    *   If offset is not a valid multiple of the size of the given type
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   If count or instanceCount are negative
    * @example
    *   {{{
    * gl.drawElementsInstanced(WebGLRenderingContext.POINTS, 2, WebGLRenderingContext.UNSIGNED_SHORT, 0, 4)
    *   }}}
    */
  def drawElementsInstanced(mode: Int, count: Int, typ: Int, offset: Int, instanceCount: Int): Unit = js.native

  /** Renders primitives from array data in a given range.
    *
    * @group Drawing_buffers
    * @param mode
    *   An Int specifying the type primitive to render. Possible values are:
    *   - [[WebGLRenderingContext.POINTS]]: Draws a single dot.
    *   - [[WebGLRenderingContext.LINE_STRIP]]: Draws a straight line to the next vertex.
    *   - [[WebGLRenderingContext.LINE_LOOP]]: Draws a straight line to the next vertex, and connects the last vertex
    *     back to the first.
    *   - [[WebGLRenderingContext.LINES]]: Draws a line between a pair of vertices.
    *   - [[WebGLRenderingContext.TRIANGLE_STRIP]]
    *   - [[WebGLRenderingContext.TRIANGLE_FAN]]
    *   - [[WebGLRenderingContext.TRIANGLES]]: Draws a triangle for a group of three vertices.
    * @param start
    *   An Int specifying the minimum array index contained in offset.
    * @param end
    *   An Int specifying the maximum array index contained in offset.
    * @param count
    *   An Int specifying the number of elements to be rendered.
    * @param typ
    *   An Int specifying the type of the values in the element array buffer. Possible values are:
    *   - [[WebGLRenderingContext.UNSIGNED_BYTE]]
    *   - [[WebGLRenderingContext.UNSIGNED_SHORT]]
    *   - [[WebGLRenderingContext.UNSIGNED_INT]]
    * @param offset
    *   An Int specifying an offset in the element array buffer. Must be a valid multiple of the size of the given type.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   If mode is not one of the accepted values
    * @throws WebGLRenderingContext.INVALID_OPERATION
    *   If offset is not a valid multiple of the size of the given type
    * @throws WebGLRenderingContext.INVALID_VALUE
    *   If count or instanceCount are negative
    * @example
    *   {{{
    * gl.drawRangeElements(WebGLRenderingContext.POINTS, 0, 7, 8, WebGLRenderingContext.UNSIGNED_BYTE, 0)
    *   }}}
    */
  def drawRangeElements(mode: Int, start: Int, end: Int, count: Int, typ: Int, offset: Int): Unit = js.native

  /** Specifies a list of color buffers to be drawn into. The draw buffer settings are part of the state of the
    * currently bound framebuffer or the drawingbuffer if no framebuffer is bound.
    *
    * @group Drawing_buffers
    * @param buffers
    *   An Array of Int specifying the buffers into which fragment colors will be written. Possible values are:
    *   - [[WebGLRenderingContext.NONE]]: Fragment shader output is not written into any color buffer.
    *   - [[WebGLRenderingContext.BACK]]: Fragment shader output is written into the back color buffer.
    *   - [[WebGLRenderingContext.COLOR_ATTACHMENT0]]: Fragment shader output is written in the nth color attachment of
    *     the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT1]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT2]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT3]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT4]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT5]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT6]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT7]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT8]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT9]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT10]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT11]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT12]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT13]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT14]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    *   - [[WebGL2RenderingContext$.COLOR_ATTACHMENT15]]: Fragment shader output is written in the nth color attachment
    *     of the current framebuffer.
    * @throws WebGLRenderingContext.INVALID_ENUM
    *   If buffers contains not one of the accepted values.
    *
    * @example
    *   {{{
    * gl.drawBuffers(WebGLRenderingContext.NONE, WebGLRenderingContext.COLOR_ATTACHMENT1])
    *   }}}
    */
  def drawBuffers(buffers: js.Array[Int]): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, Float32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, js.Array(0.0, 0.0, 0.0, 0.0))
    *   }}}
    */
  def clearBufferfv(buffer: Int, drawBuffer: Int, values: js.Array[Int]): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, Float32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, js.Array(0.0, 0.0, 0.0, 0.0))
    *   }}}
    */
  def clearBufferfv(buffer: Int, drawBuffer: Int, values: Int32Array): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, Float32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, js.Array(0.0, 0.0, 0.0, 0.0))
    *   }}}
    */
  def clearBufferfv(buffer: Int, drawBuffer: Int, values: Uint32Array): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, Float32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, js.Array(0.0, 0.0, 0.0, 0.0))
    *   }}}
    */
  def clearBufferfv(buffer: Int, drawBuffer: Int, values: Float32Array): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, Float32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, js.Array(0.0, 0.0, 0.0, 0.0))
    * gl.clearBufferfi(WebGLRenderingContext.DEPTH_STENCIL, 0, 1.0, 0)
    *   }}}
    */
  def clearBufferfv(buffer: Int, drawBuffer: Int, values: js.Array[Int], srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, Float32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, js.Array(0.0, 0.0, 0.0, 0.0))
    * gl.clearBufferfi(WebGLRenderingContext.DEPTH_STENCIL, 0, 1.0, 0)
    *   }}}
    */
  def clearBufferfv(buffer: Int, drawBuffer: Int, values: Int32Array, srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, Float32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, js.Array(0.0, 0.0, 0.0, 0.0))
    * gl.clearBufferfi(WebGLRenderingContext.DEPTH_STENCIL, 0, 1.0, 0)
    *   }}}
    */
  def clearBufferfv(buffer: Int, drawBuffer: Int, values: Uint32Array, srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, Float32Array(js.Array(r, g, b, a)))
    * gl.clearBufferfv(WebGLRenderingContext.COLOR, 0, js.Array(0.0, 0.0, 0.0, 0.0))
    * gl.clearBufferfi(WebGLRenderingContext.DEPTH_STENCIL, 0, 1.0, 0)
    *   }}}
    */
  def clearBufferfv(buffer: Int, drawBuffer: Int, values: Float32Array, srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferiv(buffer: Int, drawBuffer: Int, values: js.Array[Int]): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferiv(buffer: Int, drawBuffer: Int, values: Int32Array): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferiv(buffer: Int, drawBuffer: Int, values: Uint32Array): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferiv(buffer: Int, drawBuffer: Int, values: Float32Array): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferiv(buffer: Int, drawBuffer: Int, values: js.Array[Int], srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferiv(buffer: Int, drawBuffer: Int, values: Int32Array, srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferiv(buffer: Int, drawBuffer: Int, values: Uint32Array, srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferiv(WebGLRenderingContext.COLOR, 0, Int32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferiv(buffer: Int, drawBuffer: Int, values: Float32Array, srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferuiv(buffer: Int, drawBuffer: Int, values: js.Array[Int]): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferuiv(buffer: Int, drawBuffer: Int, values: Int32Array): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferuiv(buffer: Int, drawBuffer: Int, values: Uint32Array): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferuiv(buffer: Int, drawBuffer: Int, values: Float32Array): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferuiv(buffer: Int, drawBuffer: Int, values: js.Array[Int], srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferuiv(buffer: Int, drawBuffer: Int, values: Int32Array, srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferuiv(buffer: Int, drawBuffer: Int, values: Uint32Array, srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param values
    *   An Array of Int or Float values or an Int32Array, Uint32Array or Float32Array specifying the values to clear to.
    * @example
    *   {{{
    * gl.clearBufferuiv(WebGLRenderingContext.COLOR, 0, Uint32Array(js.Array(r, g, b, a)))
    *   }}}
    */
  def clearBufferuiv(buffer: Int, drawBuffer: Int, values: Float32Array, srcOffset: Double): Unit = js.native

  /** Clears buffers from the currently bound framebuffer.
    *
    * @group Drawing_buffers
    * @param buffer
    *   An Int specifying the buffer to clear. Possible values are:
    *   - [[WebGL2RenderingContext$.COLOR]]: Color buffer.
    *   - [[WebGL2RenderingContext$.DEPTH]]: Depth buffer.
    *   - [[WebGL2RenderingContext$.STENCIL]]: Stencil buffer.
    *   - [[WebGLRenderingContext.DEPTH_STENCIL]]: clears depth and stencil buffers (used with clearBufferfi).
    * @param drawBuffer
    *   An Int specifying the draw buffer to clear.
    * @param depth
    *   A Double specifying the value to clear a depth render buffer to.
    * @param stencil
    *   An Int specifying the value to clear the stencil render buffer to.
    * @example
    *   {{{
    * gl.clearBufferfi(WebGLRenderingContext.DEPTH_STENCIL, 0, 1.0, 0)
    *   }}}
    */
  def clearBufferfi(buffer: Int, drawBuffer: Int, depth: Double, stencil: Int): Unit = js.native

  /** @groupname Query_objects Query objects */
  /** @groupdesc Query_objects Methods for working with [[WebGLQuery]] objects. */
  /** Creates and initializes [[WebGLQuery]] objects, which provide ways to asynchronously query for information.
    *
    * @group Query_objects
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLQuery]] objects are not available in WebGL 1.
    *   {{{
    * val query = gl.createQuery()
    *   }}}
    */
  def createQuery(): WebGLQuery = js.native

  /** Deletes a given [[WebGLQuery]] object.
    *
    * @group Query_objects
    * @param query
    *   A [[WebGLQuery]] object to delete.
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLQuery]] objects are not available in WebGL 1.
    *   {{{
    * val query = gl.createQuery()
    *
    * // …
    *
    * gl.deleteQuery(query)
    *   }}}
    */
  def deleteQuery(query: WebGLQuery): Unit = js.native

  /** Returns true if a given object is a valid [[WebGLQuery]] object.
    *
    * @group Query_objects
    * @param query
    *   A [[WebGLQuery]] object to test.
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLQuery]] objects are not available in WebGL 1.
    *   {{{
    * val query = gl.createQuery()
    *
    * // …
    *
    * gl.isQuery(query)
    *   }}}
    */
  def isQuery(query: WebGLQuery): Boolean = js.native

  /** Begins an asynchronous query.
    *
    * @group Query_objects
    * @param target
    *   An Int specifying the target of the query. Possible values:
    *   - [[WebGL2RenderingContext$.ANY_SAMPLES_PASSED]]: Specifies an occlusion query: these queries detect whether an
    *     object is visible (whether the scoped drawing commands pass the depth test and if so, how many samples pass).
    *   - [[WebGL2RenderingContext$.ANY_SAMPLES_PASSED_CONSERVATIVE]]: Same as above, but less accurate and faster
    *     version.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN]]: Number of primitives that are written to
    *     transform feedback buffers.
    * @param query
    *   A [[WebGLQuery]] object for which to start the querying.
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLQuery]] objects are not available in WebGL 1.
    *   {{{
    * val query = gl.createQuery()
    * gl.beginQuery(WebGL2RenderingContext.ANY_SAMPLES_PASSED, query)
    *
    * // …
    *   }}}
    */
  def beginQuery(target: Int, query: WebGLQuery): Unit = js.native

  /** Marks the end of an asynchronous query.
    *
    * @group Query_objects
    * @param target
    *   An Int specifying the target of the query. Possible values:
    *   - [[WebGL2RenderingContext$.ANY_SAMPLES_PASSED]]: Specifies an occlusion query: these queries detect whether an
    *     object is visible (whether the scoped drawing commands pass the depth test and if so, how many samples pass).
    *   - [[WebGL2RenderingContext$.ANY_SAMPLES_PASSED_CONSERVATIVE]]: Same as above, but less accurate and faster
    *     version.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN]]: Number of primitives that are written to
    *     transform feedback buffers.
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLQuery]] objects are not available in WebGL 1.
    *   {{{
    * val query = gl.createQuery()
    * gl.beginQuery(WebGL2RenderingContext.ANY_SAMPLES_PASSED, query)
    *
    * // …
    *
    * gl.endQuery(WebGL2RenderingContext.ANY_SAMPLES_PASSED)
    *   }}}
    */
  def endQuery(target: Int): Unit = js.native

  /** Returns a [[WebGLQuery]] object for a given target.
    *
    * @group Query_objects
    * @param target
    *   An Int specifying the target of the query. Possible values:
    *   - [[WebGL2RenderingContext$.ANY_SAMPLES_PASSED]]: Specifies an occlusion query: these queries detect whether an
    *     object is visible (whether the scoped drawing commands pass the depth test and if so, how many samples pass).
    *   - [[WebGL2RenderingContext$.ANY_SAMPLES_PASSED_CONSERVATIVE]]: Same as above, but less accurate and faster
    *     version.
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN]]: Number of primitives that are written to
    *     transform feedback buffers.
    * @param pname
    *   An Int specifying the query object target. Must be WebGL2RenderingContext.CURRENT_QUERY.
    * @example
    *   {{{
    * val currentQuery = gl.getQuery(WebGL2RenderingContext.ANY_SAMPLES_PASSED, WebGL2RenderingContext.CURRENT_QUERY);
    *   }}}
    */
  def getQuery(target: Int, pname: Int): WebGLQuery = js.native

  /** Returns information about a query.
    *
    * @group Query_objects
    * @param query
    *   A [[WebGLQuery]] object.
    * @param pname
    *   An Int specifying which information to return. Possible values:
    *   - [[WebGL2RenderingContext$.QUERY_RESULT]]: Returns an Int containing the query result.
    *   - [[WebGL2RenderingContext$.QUERY_RESULT_AVAILABLE]]: Returns a Boolean indicating whether or not a query result
    *     is available.
    * @return
    *   Depends on the pname parameter, either an Int or a Boolean.
    * @example
    *   {{{
    * val query = gl.createQuery()
    * gl.beginQuery(WebGL2RenderingContext.ANY_SAMPLES_PASSED, query)
    *
    * val result = gl.getQueryParameter(query, WebGL2RenderingContext.QUERY_RESULT)
    *   }}}
    */
  def getQueryParameter(query: WebGLQuery, pname: Int): js.Any = js.native

  /** @groupname Sampler_objects Sampler objects */
  /** Creates a new [[WebGLSampler]] object.
    *
    * @group Sampler_objects
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLSampler]] objects are not available in WebGL 1.
    *   {{{
    * val sampler = gl.createSampler()
    *   }}}
    */
  def createSampler(): WebGLSampler = js.native

  /** Deletes a given [[WebGLSampler]] object.
    *
    * @group Sampler_objects
    * @param sampler
    *   A [[WebGLSampler]] object to delete.
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLSampler]] objects are not available in WebGL 1.
    *   {{{
    * val sampler = gl.createSampler()
    *
    * // …
    *
    * gl.deleteSampler(sampler)
    *   }}}
    */
  def deleteSampler(sampler: WebGLSampler): Unit = js.native

  /** Binds a given [[WebGLSampler]] to a texture unit.
    *
    * @group Sampler_objects
    * @param unit
    *   An Int specifying the index of the texture unit to which to bind the sampler to.
    * @param sampler
    *   A [[WebGLSampler]] object to bind.
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLSampler]] objects are not available in WebGL 1.
    *   {{{
    * val sampler = gl.createSampler()
    * gl.bindSampler(0, sampler)
    *   }}}
    */
  def bindSampler(unit: Int, sampler: WebGLSampler): Unit = js.native

  /** Returns true if a given object is a valid [[WebGLSampler]] object.
    *
    * @group Sampler_objects
    * @param sampler
    *   A [[WebGLSampler]] object to test.
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLSampler]] objects are not available in WebGL 1.
    *   {{{
    * val sampler = gl.createSampler()
    *
    * // …
    *
    * gl.isSampler(sampler)
    *   }}}
    */
  def isSampler(sampler: WebGLSampler): Boolean = js.native

  /** Sets sampler parameters.
    *
    * @group Sampler_objects
    * @param sampler
    *   A [[WebGLSampler]] object.
    * @param pname
    *   An Int specifying which parameter to set. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_COMPARE_FUNC]]: next parameter is an Int specifying the texture comparison
    *     function.
    *   - [[WebGL2RenderingContext$.TEXTURE_COMPARE_MODE]]: next parameter is an Int specifying the texture comparison
    *     mode.
    *   - [[WebGLRenderingContext.TEXTURE_MAG_FILTER]]: next parameter is an Int specifying the texture magnification
    *     filter.
    *   - [[WebGL2RenderingContext$.TEXTURE_MAX_LOD]]: next parameter is a Float specifying the maximum level-of-detail
    *     value.
    *   - [[WebGLRenderingContext.TEXTURE_MIN_FILTER]]: next parameter is an Int specifying the texture minification
    *     filter
    *   - [[WebGL2RenderingContext$.TEXTURE_MIN_LOD]]: next parameter is a Float specifying the minimum level-of-detail
    *     value.
    *   - [[WebGL2RenderingContext$.TEXTURE_WRAP_R]]: next parameter is an Int specifying the texture wrapping function
    *     for the texture coordinate r.
    *   - [[WebGLRenderingContext.TEXTURE_WRAP_S]]: next parameter is an Int specifying the texture wrapping function
    *     for the texture coordinate s.
    *   - [[WebGLRenderingContext.TEXTURE_WRAP_T]]: next parameter is an Int specifying the texture wrapping function
    *     for the texture coordinate t.
    * @param param
    *   An Int (samplerParameteri) or a Float (samplerParameterf) specifying a value for pname.
    * @example
    *   {{{
    * val sampler = gl.createSampler()
    * gl.samplerParameteri(sampler, WebGL2RenderingContext.TEXTURE_MAG_FILTER, WebGL2RenderingContext.NEAREST)
    *   }}}
    */
  def samplerParameteri(sampler: WebGLSampler, pname: Int, param: Int): Unit = js.native

  /** Sets sampler parameters.
    *
    * @group Sampler_objects
    * @param sampler
    *   A [[WebGLSampler]] object.
    * @param pname
    *   An Int specifying which parameter to set. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_COMPARE_FUNC]]: next parameter is an Int specifying the texture comparison
    *     function.
    *   - [[WebGL2RenderingContext$.TEXTURE_COMPARE_MODE]]: next parameter is an Int specifying the texture comparison
    *     mode.
    *   - [[WebGLRenderingContext.TEXTURE_MAG_FILTER]]: next parameter is an Int specifying the texture magnification
    *     filter.
    *   - [[WebGL2RenderingContext$.TEXTURE_MAX_LOD]]: next parameter is a Float specifying the maximum level-of-detail
    *     value.
    *   - [[WebGLRenderingContext.TEXTURE_MIN_FILTER]]: next parameter is an Int specifying the texture minification
    *     filter
    *   - [[WebGL2RenderingContext$.TEXTURE_MIN_LOD]]: next parameter is a Float specifying the minimum level-of-detail
    *     value.
    *   - [[WebGL2RenderingContext$.TEXTURE_WRAP_R]]: next parameter is an Int specifying the texture wrapping function
    *     for the texture coordinate r.
    *   - [[WebGLRenderingContext.TEXTURE_WRAP_S]]: next parameter is an Int specifying the texture wrapping function
    *     for the texture coordinate s.
    *   - [[WebGLRenderingContext.TEXTURE_WRAP_T]]: next parameter is an Int specifying the texture wrapping function
    *     for the texture coordinate t.
    * @param param
    *   An Int (samplerParameteri) or a Float (samplerParameterf) specifying a value for pname.
    * @example
    *   {{{
    * val sampler = gl.createSampler()
    * gl.samplerParameteri(sampler, WebGL2RenderingContext.TEXTURE_MAG_FILTER, WebGL2RenderingContext.NEAREST)
    *   }}}
    */
  def samplerParameterf(sampler: WebGLSampler, pname: Int, param: Float): Unit = js.native

  /** Returns sampler parameter information.
    *
    * @group Sampler_objects
    * @param sampler
    *   A [[WebGLSampler]] object.
    * @param pname
    *   An Int specifying which information to return. Possible values:
    *   - [[WebGL2RenderingContext$.TEXTURE_COMPARE_FUNC]]: Returns an Int indicating the texture comparison function.
    *   - [[WebGL2RenderingContext$.TEXTURE_COMPARE_MODE]]: Returns an Int indicating the texture comparison mode.
    *   - [[WebGLRenderingContext.TEXTURE_MAG_FILTER]]: Returns an Int indicating the texture magnification filter.
    *   - [[WebGL2RenderingContext$.TEXTURE_MAX_LOD]]: Returns a Float indicating the maximum level-of-detail value.
    *   - [[WebGLRenderingContext.TEXTURE_MIN_FILTER]]: Returns an Int indicating the texture minification filter
    *   - [[WebGL2RenderingContext$.TEXTURE_MIN_LOD]]: Returns a Float indicating the minimum level-of-detail value.
    *   - [[WebGL2RenderingContext$.TEXTURE_WRAP_R]]: Returns an Int indicating the texture wrapping function for the
    *     texture coordinate r.
    *   - [[WebGLRenderingContext.TEXTURE_WRAP_S]]: Returns an Int indicating the texture wrapping function for the
    *     texture coordinate s.
    *   - [[WebGLRenderingContext.TEXTURE_WRAP_T]]: Returns an Int indicating the texture wrapping function for the
    *     texture coordinate t.
    * @return
    *   Depends on the pname parameter, either an Int or a Float.
    * @example
    *   {{{
    * val sampler = gl.createSampler()
    * gl.getSamplerParameter(sampler, WebGL2RenderingContext.TEXTURE_COMPARE_FUNC)
    *   }}}
    */
  def getSamplerParameter(sampler: WebGLSampler, pname: Int): js.Any = js.native

  /** @groupname Sync_objects Sync objects */
  /** Creates a new [[WebGLSync]] object and inserts it into the GL command stream.
    *
    * @group Sync_objects
    * @param condition
    *   An Int specifying the condition that must be met to set the sync object's state to signaled. Must be
    *   [[WebGL2RenderingContext$.SYNC_GPU_COMMANDS_COMPLETE]].
    * @param flags
    *   An Int specifying a bitwise combination of flags controlling the behavior of the sync object. Must be 0 (exists
    *   for extensions only).
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLSync]] objects are not available in WebGL 1.
    *   {{{
    * val sync = gl.fenceSync(WebGL2RenderingContext.SYNC_GPU_COMMANDS_COMPLETE, 0)
    *   }}}
    */
  def fenceSync(condition: Int, flags: Int): WebGLSync = js.native

  /** Returns true if the passed object is a valid [[WebGLSync]] object.
    *
    * @group Sync_objects
    * @param sync
    *   A [[WebGLSync]] object to test.
    * @return
    *   A Boolean indicating whether the given object is a valid [[WebGLSync]] object (true) or not (false).
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLSync]] objects are not available in WebGL 1.
    *   {{{
    * val sync = gl.fenceSync(WebGL2RenderingContext.SYNC_GPU_COMMANDS_COMPLETE, 0)
    *
    * // …
    *
    * gl.isSync(sync)
    *   }}}
    */
  def isSync(sync: WebGLSync): Boolean = js.native

  /** Deletes a given [[WebGLSync]] object.
    *
    * @group Sync_objects
    * @param sync
    *   A [[WebGLSync]] object to delete.
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLSync]] objects are not available in WebGL 1.
    *   {{{
    * val sync = gl.fenceSync(WebGL2RenderingContext.SYNC_GPU_COMMANDS_COMPLETE, 0)
    *
    * // …
    *
    * gl.deleteSync(sync)
    *   }}}
    */
  def deleteSync(sync: WebGLSync): Unit = js.native

  /** Blocks and waits for a [[WebGLSync]] object to become signaled or a given timeout to be passed.
    *
    * @group Sync_objects
    * @param sync
    *   A [[WebGLSync]] object on which to wait on.
    * @param flags
    *   An Int specifying a bitwise combination of flags controlling the flushing behavior. May be
    *   [[WebGL2RenderingContext$.SYNC_FLUSH_COMMANDS_BIT]].
    * @param timeout
    *   A Long specifying a timeout (in nanoseconds) for which to wait for the sync object to become signaled. Must not
    *   be larger than [[WebGL2RenderingContext$.MAX_CLIENT_WAIT_TIMEOUT_WEBGL]].
    * @return
    *   An Int indicating the sync object's status:
    *   - [[WebGL2RenderingContext$.ALREADY_SIGNALED]]: Indicates that the sync object was signaled when this method was
    *     called.
    *   - [[WebGL2RenderingContext$.TIMEOUT_EXPIRED]]: Indicates that the timeout time passed and that the sync object
    *     did not become signaled.
    *   - [[WebGL2RenderingContext$.CONDITION_SATISFIED]]: Indicates that the sync object was signaled before the
    *     timeout expired.
    *   - [[WebGL2RenderingContext$.WAIT_FAILED]]: Indicates that an error occurred during the execution.
    * @example
    *   {{{
    * val sync = gl.fenceSync(WebGL2RenderingContext.SYNC_GPU_COMMANDS_COMPLETE, 0)
    * val status = gl.clientWaitSync(sync, 0, 0)
    *   }}}
    */
  def clientWaitSync(sync: WebGLSync, flags: Int, timeout: Long): Int = js.native

  /** Returns immediately, but waits on the GL server until the given [[WebGLSync]] object is signaled.
    *
    * @group Sync_objects
    * @param sync
    *   A [[WebGLSync]] object on which to wait on.
    * @param flags
    *   An Int specifying a bitwise combination of flags controlling the flushing behavior. Must be 0 (exists for
    *   extensions only).
    * @param timeout
    *   A Long specifying a timeout the server should wait before continuing. Must be
    *   [[WebGL2RenderingContext$.TIMEOUT_IGNORED]].
    * @example
    *   {{{
    * val sync = gl.fenceSync(WebGL2RenderingContext.SYNC_GPU_COMMANDS_COMPLETE, 0)
    * gl.waitSync(sync, 0, WebGL2RenderingContext.TIMEOUT_IGNORED)
    *   }}}
    */
  def waitSync(sync: WebGLSync, flags: Int, timeout: Long): Unit = js.native

  /** Returns parameter information of a [[WebGLSync]] object.
    *
    * @group Sync_objects
    * @param sync
    *   A [[WebGLSync]] object.
    * @param pname
    *   An Int specifying which information to return. Possible values:
    *   - [[WebGL2RenderingContext$.OBJECT_TYPE]]: Returns an Int indicating the type of the sync object (always
    *     [[WebGL2RenderingContext$.SYNC_FENCE]]).
    *   - [[WebGL2RenderingContext$.SYNC_STATUS]]: Returns an Int indicating the status of the sync object
    *     ([[WebGL2RenderingContext$.SIGNALED]] or [[WebGL2RenderingContext$.UNSIGNALED]]).
    *   - [[WebGL2RenderingContext$.SYNC_CONDITION]]: Returns an Int indicating the sync objects' condition (always
    *     [[WebGL2RenderingContext$.SYNC_GPU_COMMANDS_COMPLETE]]).
    *   - [[WebGL2RenderingContext$.SYNC_FLAGS]]: Returns an Int indicating the flags with which the sync object was
    *     created (always 0 as no flags are supported).
    * @example
    *   {{{
    * val sync = gl.fenceSync(WebGL2RenderingContext.SYNC_GPU_COMMANDS_COMPLETE, 0)
    * gl.getSyncParameter(sync, WebGL2RenderingContext.SYNC_STATUS)
    *   }}}
    */
  def getSyncParameter(sync: WebGLSync, pname: Int): Int = js.native

  /** @groupname Transform_feedback Transform feedback */
  /** Creates and initializes [[WebGLTransformFeedback]] objects.
    *
    * @group Transform_feedback
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLTransformFeedback]] objects are not available in WebGL 1.
    *   {{{
    * val transformFeedback = gl.createTransformFeedback()
    *   }}}
    */
  def createTransformFeedback(): WebGLTransformFeedback = js.native

  /** Deletes a given WebGLTransformFeedback object.
    *
    * @group Transform_feedback
    * @param transformFeedback
    *   A [[WebGLTransformFeedback]] object to delete.
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLTransformFeedback]] objects are not available in WebGL 1.
    *   {{{
    * val transformFeedback = gl.createTransformFeedback()
    *
    * // …
    *
    * gl.deleteTransformFeedback(transformFeedback)
    *   }}}
    */
  def deleteTransformFeedback(transformFeedback: WebGLTransformFeedback): Unit = js.native

  /** Returns true if the passed object is a valid [[WebGLTransformFeedback]] object.
    *
    * @group Transform_feedback
    * @param transformFeedback
    *   A [[WebGLTransformFeedback]] object to test.
    * @return
    *   A Boolean indicating whether the given object is a valid [[WebGLTransformFeedback]] object (true) or not
    *   (false).
    * @example
    *   gl must be a [[WebGL2RenderingContext]]. [[WebGLTransformFeedback]] objects are not available in WebGL 1.
    *   {{{
    * val transformFeedback = gl.createTransformFeedback()
    *
    * // …
    *
    * gl.isTransformFeedback(transformFeedback)
    *   }}}
    */
  def isTransformFeedback(transformFeedback: WebGLTransformFeedback): Boolean = js.native

  /** Binds a passed [[WebGLTransformFeedback]] object to the current GL state.
    *
    * @group Transform_feedback
    * @param target
    *   An Int specifying the target (binding point). Must be [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK]].
    * @param transformFeedback
    *   A [[WebGLTransformFeedback]] object to bind.
    * @example
    *   {{{
    * val transformFeedback = gl.createTransformFeedback()
    * gl.bindTransformFeedback(WebGL2RenderingContext.TRANSFORM_FEEDBACK, transformFeedback)
    *   }}}
    */
  def bindTransformFeedback(target: Int, transformFeedback: WebGLTransformFeedback): Unit = js.native

  /** Starts a transform feedback operation.
    *
    * @group Transform_feedback
    * @param primitiveMode
    *   An Int specifying the output type of the primitives that will be recorded into the buffer objects that are bound
    *   for transform feedback. Possible values:
    *   - [[WebGLRenderingContext$.POINTS]]
    *   - [[WebGLRenderingContext$.LINES]]
    *   - [[WebGLRenderingContext$.TRIANGLES]]
    * @example
    *   {{{
    * vak transformFeedback = gl.createTransformFeedback()
    * gl.bindTransformFeedback(WebGL2RenderingContext.TRANSFORM_FEEDBACK, transformFeedback)
    * gl.beginTransformFeedback(WebGLRenderingContext.TRIANGLES)
    * gl.drawArrays(WebGLRenderingContext.TRIANGLES, 0, 3)
    *   }}}
    */
  def beginTransformFeedback(primitiveMode: Int): Unit = js.native

  /** Ends a transform feedback operation.
    *
    * @group Transform_feedback
    * @example
    *   {{{
    * val transformFeedback = gl.createTransformFeedback();
    * gl.bindTransformFeedback(WebGL2RenderingContext.TRANSFORM_FEEDBACK, transformFeedback);
    * gl.beginTransformFeedback(WebGLRenderingContext.TRIANGLES);
    * gl.drawArrays(WebGLRenderingContext.TRIANGLES, 0, 3);
    * gl.endTransformFeedback()
    *   }}}
    */
  def endTransformFeedback(): Unit = js.native

  /** Specifies values to record in WebGLTransformFeedback buffers.
    *
    * @group Transform_feedback
    * @param program
    *   A [[WebGLProgram]].
    * @param varyings
    *   A JavaScript Array of string specifying the names of the varying variables to use.
    * @param bufferMode
    *   An Int specifying the mode to use when capturing the varying variables. Either
    *   [[WebGL2RenderingContext$.INTERLEAVED_ATTRIBS]] or [[WebGL2RenderingContext$.SEPARATE_ATTRIBS]].
    * @example
    *   {{{
    * val transformFeedback = gl.createTransformFeedback()
    * gl.bindTransformFeedback(WebGL2RenderingContext.TRANSFORM_FEEDBACK, transformFeedback)
    * val transformFeedbackOutputs = js.Array("gl_Position", "anotherOutput")
    *
    * gl.transformFeedbackVaryings(
    *   shaderProg,
    *   transformFeedbackOutputs,
    *   WebGL2RenderingContext.INTERLEAVED_ATTRIBS
    * )
    * gl.linkProgram(shaderProg)
    *   }}}
    */
  def transformFeedbackVaryings(program: WebGLProgram, varyings: js.Array[String], bufferMode: Int): Unit = js.native

  /** Returns information about varying variables from WebGLTransformFeedback buffers.
    *
    * @group Transform_feedback
    * @param program
    *   A [[WebGLProgram]].
    * @param index
    *   An Int specifying the index of the varying variable whose information to retrieve.
    * @example
    *   {{{
    * activeInfo = gl.getTransformFeedbackVarying(program, 0)
    *   }}}
    */
  def getTransformFeedbackVarying(program: WebGLProgram, index: Int): WebGLActiveInfo = js.native

  /** Pauses a transform feedback operation.
    *
    * @group Transform_feedback
    * @example
    *   {{{
    * val transformFeedback = gl.createTransformFeedback()
    * gl.bindTransformFeedback(WebGL2RenderingContext.TRANSFORM_FEEDBACK, transformFeedback)
    * gl.beginTransformFeedback(WebGLRenderingContext.TRIANGLES)
    * gl.pauseTransformFeedback()
    * // …
    * gl.resumeTransformFeedback()
    * gl.drawArrays(WebGLRenderingContext.TRIANGLES, 0, 3)
    * gl.endTransformFeedback()
    *   }}}
    */
  def pauseTransformFeedback(): Unit = js.native

  /** Resumes a transform feedback operation.
    *
    * @group Transform_feedback
    * @example
    *   {{{
    * val transformFeedback = gl.createTransformFeedback()
    * gl.bindTransformFeedback(WebGL2RenderingContext.TRANSFORM_FEEDBACK, transformFeedback)
    * gl.beginTransformFeedback(WebGLRenderingContext.TRIANGLES)
    * gl.pauseTransformFeedback()
    * //…
    * gl.resumeTransformFeedback()
    * gl.drawArrays(WebGLRenderingContext.TRIANGLES, 0, 3)
    * gl.endTransformFeedback()
    *   }}}
    */
  def resumeTransformFeedback(): Unit = js.native

  /** @groupname Uniform_buffer_objects Uniform buffer objects */
  /** Binds a given [[WebGLBuffer]] to a given binding point (target) at a given index.
    *
    * @group Uniform_buffer_objects
    * @param target
    *   An Int specifying the target for the bind operation. Possible values:
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]
    * @param index
    *   An Int specifying the index of the target.
    * @param buffer
    *   A [[WebGLBuffer]] which to bind to the binding point (target).
    * @example
    *   {{{
    * gl.bindBufferBase(WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER, 0, buffer)
    *   }}}
    */
  def bindBufferBase(target: Int, index: Int, buffer: WebGLBuffer): Unit = js.native

  /** Binds a range of a given [[WebGLBuffer]] to a given binding point (target) at a given index.
    *
    * @group Uniform_buffer_objects
    * @param target
    *   An Int specifying the target for the bind operation. Possible values:
    *   - [[WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER]]
    *   - [[WebGL2RenderingContext$.UNIFORM_BUFFER]]
    * @param index
    *   An Int specifying the index of the target.
    * @param buffer
    *   A [[WebGLBuffer]] which to bind to the binding point (target).
    * @param offset
    *   An Int specifying the starting offset.
    * @param size
    *   An Int specifying the amount of data that can be read from the buffer.
    * @example
    *   {{{
    * gl.bindBufferRange(WebGL2RenderingContext$.TRANSFORM_FEEDBACK_BUFFER, 1, buffer, 0, 4)
    *   }}}
    */
  def bindBufferRange(
      target: Int, index: Int, buffer: WebGLBuffer, offset: Int, size: Int
  ): Unit = js.native

  /** Retrieves the indices of a number of uniforms within a [[WebGLProgram]].
    *
    * @group Uniform_buffer_objects
    * @param program
    *   A [[WebGLProgram]] containing uniforms whose indices to query.
    * @param uniformNames
    *   An Array of string specifying the names of the uniforms to query.
    * @return
    *   A JavaScript Array of Int containing the uniform indices.
    * @example
    *   {{{
    * val uniformIndices = gl.getUniformIndices(program, js.Array(
    *   "UBORed",
    *   "UBOGreen",
    *   "UBOBlue",
    * ))
    *   }}}
    */
  def getUniformIndices(program: WebGLProgram, uniformNames: js.Array[String]): js.Array[Int] = js.native

  /** Retrieves information about active uniforms within a [[WebGLProgram]].
    *
    * @group Uniform_buffer_objects
    * @param program
    *   A [[WebGLProgram]] containing the active uniforms.
    * @param uniformIndices
    *   A JavaScript Array of Int specifying the indices of the active uniforms to query.
    * @param pname
    *   An Int specifying which information to query. Possible values:
    *   - [[WebGL2RenderingContext$.UNIFORM_TYPE]]: Returns a JavaScript Array of Int indicating the types of the
    *     uniforms.
    *   - [[WebGL2RenderingContext$.UNIFORM_SIZE]]: Returns a JavaScript Array of Int indicating the sizes of the
    *     uniforms.
    *   - [[WebGL2RenderingContext$.UNIFORM_BLOCK_INDEX]]: Returns a JavaScript Array of Int indicating the block
    *     indices of the uniforms.
    *   - [[WebGL2RenderingContext$.UNIFORM_OFFSET]]: Returns a JavaScript Array of Int indicating the uniform buffer
    *     offsets.
    *   - [[WebGL2RenderingContext$.UNIFORM_ARRAY_STRIDE]]: Returns a JavaScript Array of Int indicating the strides
    *     between the elements.
    *   - [[WebGL2RenderingContext$.UNIFORM_MATRIX_STRIDE]]: Returns a JavaScript Array of Int indicating the strides
    *     between columns of a column-major matrix or a row-major matrix.
    *   - [[WebGL2RenderingContext$.UNIFORM_IS_ROW_MAJOR]]: Returns a JavaScript Array of Boolean indicating whether
    *     each of the uniforms is a row-major matrix or not.
    * @example
    *   {{{
    * val uniformIndices = gl.getUniformIndices(program, js.Array(
    *   "UBORed",
    *   "UBOGreen",
    *   "UBOBlue"
    * ))
    * val uniformOffsets = gl.getActiveUniforms(
    *   program,
    *   uniformIndices,
    *   WebGL2RenderingContext.UNIFORM_OFFSET
    * )
    *   }}}
    */
  def getActiveUniforms(program: WebGLProgram, uniformIndices: js.Array[Int], pname: Int): js.Array[js.Any] = js.native

  /** Retrieves the index of a uniform block within a [[WebGLProgram]].
    *
    * @group Uniform_buffer_objects
    * @param program
    *   A [[WebGLProgram]] containing the uniform block.
    * @param uniformBlockName
    *   A string specifying the name of the uniform block to whose index to retrieve.
    * @return
    *   An Int indicating the uniform block index.
    * @example
    *   {{{
    * // Assuming a shader with the following declaration:
    * // uniform UBOData {
    * //   mat4 foo;
    * // } instanceName;
    *
    * // use the block name, not the instance name:
    * val blockIndex = gl.getUniformBlockIndex(program, "UBOData")
    *   }}}
    */
  def getUniformBlockIndex(program: WebGLProgram, uniformBlockName: String): Int = js.native

  /** Retrieves information about an active uniform block within a [[WebGLProgram]].
    *
    * @group Uniform_buffer_objects
    * @param program
    *   A [[WebGLProgram]] containing the active uniform block.
    * @param uniformBlockIndex
    *   A Double specifying the index of the active uniform block within the program.
    * @param pname
    *   An Int specifying which information to query. Possible values:
    *   - [[WebGL2RenderingContext$.UNIFORM_BLOCK_BINDING]]: Returns an Int indicating the uniform buffer binding point.
    *   - [[WebGL2RenderingContext$.UNIFORM_BLOCK_DATA_SIZE]]: Returns an Int indicating the minimum total buffer object
    *     size.
    *   - [[WebGL2RenderingContext$.UNIFORM_BLOCK_ACTIVE_UNIFORMS]]: Returns an Int indicating the number of active
    *     uniforms in the uniform block.
    *   - [[WebGL2RenderingContext$.UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES]]: Returns a Uint32Array indicating the list of
    *     active uniforms in the uniform block.
    *   - [[WebGL2RenderingContext$.UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER]]: Returns a Boolean indicating whether
    *     the uniform block is referenced by the vertex shader.
    *   - [[WebGL2RenderingContext$.UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER]]: Returns a Boolean indicating whether
    *     the uniform block is referenced by the fragment shader.
    * @return
    *   Depends on which information is requested using the pname parameter. If an error occurs, null is returned.
    * @example
    *   {{{
    * val blockSize = gl.getActiveUniformBlockParameter(
    *   program,
    *   blockIndex,
    *   WebGL2RenderingContext.UNIFORM_BLOCK_DATA_SIZE,
    * )
    *   }}}
    */
  def getActiveUniformBlockParameter(program: WebGLProgram, uniformBlockIndex: Double, pname: Int): js.Any = js.native

  /** Retrieves the name of the active uniform block at a given index within a [[WebGLProgram]].
    *
    * @group Uniform_buffer_objects
    * @param program
    *   A [[WebGLProgram]] containing the uniform block.
    * @param uniformBlockIndex
    *   A Double specifying the index of the uniform block to whose name to retrieve.
    * @return
    *   A string indicating the active uniform block name.
    * @example
    *   {{{
    * val blockName = gl.getActiveUniformBlockName(program, 0)
    *   }}}
    */
  def getActiveUniformBlockName(program: WebGLProgram, uniformBlockIndex: Double): String = js.native

  /** Assigns binding points for active uniform blocks.
    *
    * @group Uniform_buffer_objects
    * @param program
    *   A [[WebGLProgram]] containing the active uniform block whose binding to assign.
    * @param uniformBlockIndex
    *   A Double specifying the index of the active uniform block within the program.
    * @param uniformBlockBinding
    *   An Int specifying the binding point to which to bind the uniform block.
    * @example
    *   {{{
    * gl.uniformBlockBinding(program, 0, 1)
    *   }}}
    */
  def uniformBlockBinding(program: WebGLProgram, uniformBlockIndex: Double, uniformBlockBinding: Int): Unit = js.native

  /** @groupname Vertex_array_objects Vertex array objects */
  /** @groupdesc Vertex_array_objects Methods for working with [[WebGLVertexArrayObject]] (VAO) objects. */
  /** Creates and initializes a [[WebGLVertexArrayObject]] object that represents a vertex array object (VAO) pointing
    * to vertex array data and which provides names for different sets of vertex data.
    *
    * @group Vertex_array_objects
    * @example
    *   {{{
    * val vao = gl.createVertexArray()
    * gl.bindVertexArray(vao)
    *
    * // …
    *
    * // calls to bindBuffer or vertexAttribPointer
    * // which will be "recorded" in the VAO
    *
    * // …
    *   }}}
    */
  def createVertexArray(): WebGLVertexArrayObject = js.native

  /** Deletes a given [[WebGLVertexArrayObject]].
    *
    * @group Vertex_array_objects
    * @param vertexArray
    *   A [[WebGLVertexArrayObject]] (VAO) object to delete.
    * @example
    *   {{{
    * val vao = gl.createVertexArray()
    * gl.bindVertexArray(vao)
    *
    * // …
    *
    * gl.deleteVertexArray(vao)
    *   }}}
    */
  def deleteVertexArray(vertexArray: WebGLVertexArrayObject): Unit = js.native

  /** Returns true if a given object is a valid [[WebGLVertexArrayObject]].
    *
    * @group Vertex_array_objects
    * @param vertexArray
    *   A [[WebGLVertexArrayObject]] (VAO) object to test.
    * @example
    *   {{{
    * val vao = gl.createVertexArray()
    * gl.bindVertexArray(vao)
    *
    * // …
    *
    * gl.isVertexArray(vao)
    *   }}}
    */
  def isVertexArray(vertexArray: WebGLVertexArrayObject): Boolean = js.native

  /** Binds a given [[WebGLVertexArrayObject]] to the buffer.
    *
    * @group Vertex_array_objects
    * @param vertexArray
    *   A [[WebGLVertexArrayObject]] (VAO) object to bind.
    * @example
    *   {{{
    * val vao = gl.createVertexArray()
    * gl.bindVertexArray(vao)
    *
    * // …
    *
    * // calls to bindBuffer or vertexAttribPointer
    * // which will be "recorded" in the VAO
    *
    * // …
    *   }}}
    */
  def bindVertexArray(vertexArray: WebGLVertexArrayObject): Unit = js.native
}

object WebGL2RenderingContext {

  /** @groupname Getting_GL_parameter_information Getting GL parameter information */
  /** @groupdesc Getting_GL_parameter_information
    *   Constants passed to WebGLRenderingContext.getParameter() to specify what information to return.
    */
  /** @group Getting_GL_parameter_information */
  val READ_BUFFER: Int = 0x0C02

  /** @group Getting_GL_parameter_information */
  val UNPACK_ROW_LENGTH: Int = 0x0CF2

  /** @group Getting_GL_parameter_information */
  val UNPACK_SKIP_ROWS: Int = 0x0CF3

  /** @group Getting_GL_parameter_information */
  val UNPACK_SKIP_PIXELS: Int = 0x0CF4

  /** @group Getting_GL_parameter_information */
  val PACK_ROW_LENGTH: Int = 0x0D02

  /** @group Getting_GL_parameter_information */
  val PACK_SKIP_ROWS: Int = 0x0D03

  /** @group Getting_GL_parameter_information */
  val PACK_SKIP_PIXELS: Int = 0x0D04

  /** @group Getting_GL_parameter_information */
  val TEXTURE_BINDING_3D: Int = 0x806A

  /** @group Getting_GL_parameter_information */
  val UNPACK_SKIP_IMAGES: Int = 0x806D

  /** @group Getting_GL_parameter_information */
  val UNPACK_IMAGE_HEIGHT: Int = 0x806E

  /** @group Getting_GL_parameter_information */
  val MAX_3D_TEXTURE_SIZE: Int = 0x8073

  /** @group Getting_GL_parameter_information */
  val MAX_ELEMENTS_VERTICES: Int = 0x80E8

  /** @group Getting_GL_parameter_information */
  val MAX_ELEMENTS_INDICES: Int = 0x80E9

  /** @group Getting_GL_parameter_information */
  val MAX_TEXTURE_LOD_BIAS: Int = 0x84FD

  /** @group Getting_GL_parameter_information */
  val MAX_FRAGMENT_UNIFORM_COMPONENTS: Int = 0x8B49

  /** @group Getting_GL_parameter_information */
  val MAX_VERTEX_UNIFORM_COMPONENTS: Int = 0x8B4A

  /** @group Getting_GL_parameter_information */
  val MAX_ARRAY_TEXTURE_LAYERS: Int = 0x88FF

  /** @group Getting_GL_parameter_information */
  val MIN_PROGRAM_TEXEL_OFFSET: Int = 0x8904

  /** @group Getting_GL_parameter_information */
  val MAX_PROGRAM_TEXEL_OFFSET: Int = 0x8905

  /** @group Getting_GL_parameter_information */
  val MAX_VARYING_COMPONENTS: Int = 0x8B4B

  /** @group Getting_GL_parameter_information */
  val FRAGMENT_SHADER_DERIVATIVE_HINT: Int = 0x8B8B

  /** @group Getting_GL_parameter_information */
  val RASTERIZER_DISCARD: Int = 0x8C89

  /** @group Getting_GL_parameter_information */
  val VERTEX_ARRAY_BINDING: Int = 0x85B5

  /** @group Getting_GL_parameter_information */
  val MAX_VERTEX_OUTPUT_COMPONENTS: Int = 0x9122

  /** @group Getting_GL_parameter_information */
  val MAX_FRAGMENT_INPUT_COMPONENTS: Int = 0x9125

  /** @group Getting_GL_parameter_information */
  val MAX_SERVER_WAIT_TIMEOUT: Int = 0x9111

  /** @group Getting_GL_parameter_information */
  val MAX_ELEMENT_INDEX: Int = 0x8D6B

  /** @groupname Textures Textures */
  /** @groupdesc Textures
    *   Constants passed to WebGLRenderingContext.texParameteri(), WebGLRenderingContext.texParameterf(),
    *   WebGLRenderingContext.bindTexture(), WebGLRenderingContext.texImage2D(), and others.
    */
  /** @group Textures */
  val RED: Int = 0x1903

  /** @group Textures */
  val RGB8: Int = 0x8051

  /** @group Textures */
  val RGBA8: Int = 0x8058

  /** @group Textures */
  val RGB10_A2: Int = 0x8059

  /** @group Textures */
  val TEXTURE_3D: Int = 0x806F

  /** @group Textures */
  val TEXTURE_WRAP_R: Int = 0x8072

  /** @group Textures */
  val TEXTURE_MIN_LOD: Int = 0x813A

  /** @group Textures */
  val TEXTURE_MAX_LOD: Int = 0x813B

  /** @group Textures */
  val TEXTURE_BASE_LEVEL: Int = 0x813C

  /** @group Textures */
  val TEXTURE_MAX_LEVEL: Int = 0x813D

  /** @group Textures */
  val TEXTURE_COMPARE_MODE: Int = 0x884C

  /** @group Textures */
  val TEXTURE_COMPARE_FUNC: Int = 0x884D

  /** @group Textures */
  val SRGB: Int = 0x8C40

  /** @group Textures */
  val SRGB8: Int = 0x8C41

  /** @group Textures */
  val SRGB8_ALPHA8: Int = 0x8C43

  /** @group Textures */
  val COMPARE_REF_TO_TEXTURE: Int = 0x884E

  /** @group Textures */
  val RGBA32F: Int = 0x8814

  /** @group Textures */
  val RGB32F: Int = 0x8815

  /** @group Textures */
  val RGBA16F: Int = 0x881A

  /** @group Textures */
  val RGB16F: Int = 0x881B

  /** @group Textures */
  val TEXTURE_2D_ARRAY: Int = 0x8C1A

  /** @group Textures */
  val TEXTURE_BINDING_2D_ARRAY: Int = 0x8C1D

  /** @group Textures */
  val R11F_G11F_B10F: Int = 0x8C3A

  /** @group Textures */
  val RGB9_E5: Int = 0x8C3D

  /** @group Textures */
  val RGBA32UI: Int = 0x8D70

  /** @group Textures */
  val RGB32UI: Int = 0x8D71

  /** @group Textures */
  val RGBA16UI: Int = 0x8D76

  /** @group Textures */
  val RGB16UI: Int = 0x8D77

  /** @group Textures */
  val RGBA8UI: Int = 0x8D7C

  /** @group Textures */
  val RGB8UI: Int = 0x8D7D

  /** @group Textures */
  val RGBA32I: Int = 0x8D82

  /** @group Textures */
  val RGB32I: Int = 0x8D83

  /** @group Textures */
  val RGBA16I: Int = 0x8D88

  /** @group Textures */
  val RGB16I: Int = 0x8D89

  /** @group Textures */
  val RGBA8I: Int = 0x8D8E

  /** @group Textures */
  val RGB8I: Int = 0x8D8F

  /** @group Textures */
  val RED_INTEGER: Int = 0x8D94

  /** @group Textures */
  val RGB_INTEGER: Int = 0x8D98

  /** @group Textures */
  val RGBA_INTEGER: Int = 0x8D99

  /** @group Textures */
  val R8: Int = 0x8229

  /** @group Textures */
  val RG8: Int = 0x822B

  /** @group Textures */
  val R16F: Int = 0x822D

  /** @group Textures */
  val R32F: Int = 0x822E

  /** @group Textures */
  val RG16F: Int = 0x822F

  /** @group Textures */
  val RG32F: Int = 0x8230

  /** @group Textures */
  val R8I: Int = 0x8231

  /** @group Textures */
  val R8UI: Int = 0x8232

  /** @group Textures */
  val R16I: Int = 0x8233

  /** @group Textures */
  val R16UI: Int = 0x8234

  /** @group Textures */
  val R32I: Int = 0x8235

  /** @group Textures */
  val R32UI: Int = 0x8236

  /** @group Textures */
  val RG8I: Int = 0x8237

  /** @group Textures */
  val RG8UI: Int = 0x8238

  /** @group Textures */
  val RG16I: Int = 0x8239

  /** @group Textures */
  val RG16UI: Int = 0x823A

  /** @group Textures */
  val RG32I: Int = 0x823B

  /** @group Textures */
  val RG32UI: Int = 0x823C

  /** @group Textures */
  val R8_SNORM: Int = 0x8F94

  /** @group Textures */
  val RG8_SNORM: Int = 0x8F95

  /** @group Textures */
  val RGB8_SNORM: Int = 0x8F96

  /** @group Textures */
  val RGBA8_SNORM: Int = 0x8F97

  /** @group Textures */
  val RGB10_A2UI: Int = 0x906F

  /** @group Textures */
  val TEXTURE_IMMUTABLE_FORMAT: Int = 0x912F

  /** @group Textures */
  val TEXTURE_IMMUTABLE_LEVELS: Int = 0x82DF

  /** @groupname Pixel_types Pixel types */
  /** @group Pixel_types */
  val UNSIGNED_INT_2_10_10_10_REV: Int = 0x8368

  /** @group Pixel_types */
  val UNSIGNED_INT_10F_11F_11F_REV: Int = 0x8C3B

  /** @group Pixel_types */
  val UNSIGNED_INT_5_9_9_9_REV: Int = 0x8C3E

  /** @group Pixel_types */
  val FLOAT_32_UNSIGNED_INT_24_8_REV: Int = 0x8DAD

  /** @group Pixel_types */
  val UNSIGNED_INT_24_8: Int = 0x84FA

  /** @group Pixel_types */
  val HALF_FLOAT: Int = 0x140B

  /** @group Pixel_types */
  val RG: Int = 0x8227

  /** @group Pixel_types */
  val RG_INTEGER: Int = 0x8228

  /** @group Pixel_types */
  val INT_2_10_10_10_REV: Int = 0x8D9F

  /** @groupname Queries Queries */
  /** @group Queries */
  val CURRENT_QUERY: Int = 0x8865

  /** @group Queries */
  val QUERY_RESULT: Int = 0x8866

  /** @group Queries */
  val QUERY_RESULT_AVAILABLE: Int = 0x8867

  /** @group Queries */
  val ANY_SAMPLES_PASSED: Int = 0x8C2F

  /** @group Queries */
  val ANY_SAMPLES_PASSED_CONSERVATIVE: Int = 0x8D6A

  /** @groupname Draw_buffers Draw buffers */
  /** @group Draw_buffers */
  val MAX_DRAW_BUFFERS: Int = 0x8824

  /** @group Draw_buffers */
  val DRAW_BUFFER0: Int = 0x8825

  /** @group Draw_buffers */
  val DRAW_BUFFER1: Int = 0x8826

  /** @group Draw_buffers */
  val DRAW_BUFFER2: Int = 0x8827

  /** @group Draw_buffers */
  val DRAW_BUFFER3: Int = 0x8828

  /** @group Draw_buffers */
  val DRAW_BUFFER4: Int = 0x8829

  /** @group Draw_buffers */
  val DRAW_BUFFER5: Int = 0x882A

  /** @group Draw_buffers */
  val DRAW_BUFFER6: Int = 0x882B

  /** @group Draw_buffers */
  val DRAW_BUFFER7: Int = 0x882C

  /** @group Draw_buffers */
  val DRAW_BUFFER8: Int = 0x882D

  /** @group Draw_buffers */
  val DRAW_BUFFER9: Int = 0x882E

  /** @group Draw_buffers */
  val DRAW_BUFFER10: Int = 0x882F

  /** @group Draw_buffers */
  val DRAW_BUFFER11: Int = 0x8830

  /** @group Draw_buffers */
  val DRAW_BUFFER12: Int = 0x8831

  /** @group Draw_buffers */
  val DRAW_BUFFER13: Int = 0x8832

  /** @group Draw_buffers */
  val DRAW_BUFFER14: Int = 0x8833

  /** @group Draw_buffers */
  val DRAW_BUFFER15: Int = 0x8834

  /** @group Draw_buffers */
  val MAX_COLOR_ATTACHMENTS: Int = 0x8CDF

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT1: Int = 0x8CE1

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT2: Int = 0x8CE2

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT3: Int = 0x8CE3

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT4: Int = 0x8CE4

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT5: Int = 0x8CE5

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT6: Int = 0x8CE6

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT7: Int = 0x8CE7

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT8: Int = 0x8CE8

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT9: Int = 0x8CE9

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT10: Int = 0x8CEA

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT11: Int = 0x8CEB

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT12: Int = 0x8CEC

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT13: Int = 0x8CED

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT14: Int = 0x8CEE

  /** @group Draw_buffers */
  val COLOR_ATTACHMENT15: Int = 0x8CEF

  /** @groupname Samplers Samplers */
  /** @group Samplers */
  val SAMPLER_3D: Int = 0x8B5F

  /** @group Samplers */
  val SAMPLER_2D_SHADOW: Int = 0x8B62

  /** @group Samplers */
  val SAMPLER_2D_ARRAY: Int = 0x8DC1

  /** @group Samplers */
  val SAMPLER_2D_ARRAY_SHADOW: Int = 0x8DC4

  /** @group Samplers */
  val SAMPLER_CUBE_SHADOW: Int = 0x8DC5

  /** @group Samplers */
  val INT_SAMPLER_2D: Int = 0x8DCA

  /** @group Samplers */
  val INT_SAMPLER_3D: Int = 0x8DCB

  /** @group Samplers */
  val INT_SAMPLER_CUBE: Int = 0x8DCC

  /** @group Samplers */
  val INT_SAMPLER_2D_ARRAY: Int = 0x8DCF

  /** @group Samplers */
  val UNSIGNED_INT_SAMPLER_2D: Int = 0x8DD2

  /** @group Samplers */
  val UNSIGNED_INT_SAMPLER_3D: Int = 0x8DD3

  /** @group Samplers */
  val UNSIGNED_INT_SAMPLER_CUBE: Int = 0x8DD4

  /** @group Samplers */
  val UNSIGNED_INT_SAMPLER_2D_ARRAY: Int = 0x8DD7

  /** @group Samplers */
  val MAX_SAMPLES: Int = 0x8D57

  /** @group Samplers */
  val SAMPLER_BINDING: Int = 0x8919

  /** @groupname Buffers Buffers */
  /** @group Buffers */
  val PIXEL_PACK_BUFFER: Int = 0x88EB

  /** @group Buffers */
  val PIXEL_UNPACK_BUFFER: Int = 0x88EC

  /** @group Buffers */
  val PIXEL_PACK_BUFFER_BINDING: Int = 0x88ED

  /** @group Buffers */
  val PIXEL_UNPACK_BUFFER_BINDING: Int = 0x88EF

  /** @group Buffers */
  val COPY_READ_BUFFER: Int = 0x8F36

  /** @group Buffers */
  val COPY_WRITE_BUFFER: Int = 0x8F37

  /** @group Buffers */
  val COPY_READ_BUFFER_BINDING: Int = 0x8F36

  /** @group Buffers */
  val COPY_WRITE_BUFFER_BINDING: Int = 0x8F37

  /** @groupname Data_types Data types */
  /** @group Data_types */
  val FLOAT_MAT2x3: Int = 0x8B65

  /** @group Data_types */
  val FLOAT_MAT2x4: Int = 0x8B66

  /** @group Data_types */
  val FLOAT_MAT3x2: Int = 0x8B67

  /** @group Data_types */
  val FLOAT_MAT3x4: Int = 0x8B68

  /** @group Data_types */
  val FLOAT_MAT4x2: Int = 0x8B69

  /** @group Data_types */
  val FLOAT_MAT4x3: Int = 0x8B6A

  /** @group Data_types */
  val UNSIGNED_INT_VEC2: Int = 0x8DC6

  /** @group Data_types */
  val UNSIGNED_INT_VEC3: Int = 0x8DC7

  /** @group Data_types */
  val UNSIGNED_INT_VEC4: Int = 0x8DC8

  /** @group Data_types */
  val UNSIGNED_NORMALIZED: Int = 0x8C17

  /** @group Data_types */
  val SIGNED_NORMALIZED: Int = 0x8F9C

  /** @groupname Vertex_attributes Vertex attributes */
  /** @group Vertex_attributes */
  val VERTEX_ATTRIB_ARRAY_INTEGER: Int = 0x88FD

  /** @group Vertex_attributes */
  val VERTEX_ATTRIB_ARRAY_DIVISOR: Int = 0x88FE

  /** @groupname Transform_feedback Transform feedback */
  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK_BUFFER_MODE: Int = 0x8C7F

  /** @group Transform_feedback */
  val MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Int = 0x8C80

  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK_VARYINGS: Int = 0x8C83

  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK_BUFFER_START: Int = 0x8C84

  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK_BUFFER_SIZE: Int = 0x8C85

  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Int = 0x8C88

  /** @group Transform_feedback */
  val MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Int = 0x8C8A

  /** @group Transform_feedback */
  val MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Int = 0x8C8B

  /** @group Transform_feedback */
  val INTERLEAVED_ATTRIBS: Int = 0x8C8C

  /** @group Transform_feedback */
  val SEPARATE_ATTRIBS: Int = 0x8C8D

  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK_BUFFER: Int = 0x8C8E

  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK_BUFFER_BINDING: Int = 0x8C8F

  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK: Int = 0x8E22

  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK_PAUSED: Int = 0x8E23

  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK_ACTIVE: Int = 0x8E24

  /** @group Transform_feedback */
  val TRANSFORM_FEEDBACK_BINDING: Int = 0x8E25

  /** @groupname Framebuffers_and_renderbuffers Framebuffers and renderbuffers */
  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Int = 0x8210

  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Int = 0x8211

  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_ATTACHMENT_RED_SIZE: Int = 0x8212

  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Int = 0x8213

  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Int = 0x8214

  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Int = 0x8215

  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Int = 0x8216

  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Int = 0x8217

  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_DEFAULT: Int = 0x8218

  /** @group Framebuffers_and_renderbuffers */
  val DEPTH_STENCIL_ATTACHMENT: Int = 0x821A

  /** @group Framebuffers_and_renderbuffers */
  val DEPTH_STENCIL: Int = 0x84F9

  /** @group Framebuffers_and_renderbuffers */
  val DEPTH24_STENCIL8: Int = 0x88F0

  /** @group Framebuffers_and_renderbuffers */
  val DRAW_FRAMEBUFFER_BINDING: Int = 0x8CA6

  /** @group Framebuffers_and_renderbuffers */
  val READ_FRAMEBUFFER: Int = 0x8CA8

  /** @group Framebuffers_and_renderbuffers */
  val DRAW_FRAMEBUFFER: Int = 0x8CA9

  /** @group Framebuffers_and_renderbuffers */
  val READ_FRAMEBUFFER_BINDING: Int = 0x8CAA

  /** @group Framebuffers_and_renderbuffers */
  val RENDERBUFFER_SAMPLES: Int = 0x8CAB

  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Int = 0x8CD4

  /** @group Framebuffers_and_renderbuffers */
  val FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Int = 0x8D56

  /** @groupname Uniforms Uniforms */
  /** @group Uniforms */
  val UNIFORM_BUFFER: Int = 0x8A11

  /** @group Uniforms */
  val UNIFORM_BUFFER_BINDING: Int = 0x8A28

  /** @group Uniforms */
  val UNIFORM_BUFFER_START: Int = 0x8A29

  /** @group Uniforms */
  val UNIFORM_BUFFER_SIZE: Int = 0x8A2A

  /** @group Uniforms */
  val MAX_VERTEX_UNIFORM_BLOCKS: Int = 0x8A2B

  /** @group Uniforms */
  val MAX_FRAGMENT_UNIFORM_BLOCKS: Int = 0x8A2D

  /** @group Uniforms */
  val MAX_COMBINED_UNIFORM_BLOCKS: Int = 0x8A2E

  /** @group Uniforms */
  val MAX_UNIFORM_BUFFER_BINDINGS: Int = 0x8A2F

  /** @group Uniforms */
  val MAX_UNIFORM_BLOCK_SIZE: Int = 0x8A30

  /** @group Uniforms */
  val MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Int = 0x8A31

  /** @group Uniforms */
  val MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Int = 0x8A33

  /** @group Uniforms */
  val UNIFORM_BUFFER_OFFSET_ALIGNMENT: Int = 0x8A34

  /** @group Uniforms */
  val ACTIVE_UNIFORM_BLOCKS: Int = 0x8A36

  /** @group Uniforms */
  val UNIFORM_TYPE: Int = 0x8A37

  /** @group Uniforms */
  val UNIFORM_SIZE: Int = 0x8A38

  /** @group Uniforms */
  val UNIFORM_BLOCK_INDEX: Int = 0x8A3A

  /** @group Uniforms */
  val UNIFORM_OFFSET: Int = 0x8A3B

  /** @group Uniforms */
  val UNIFORM_ARRAY_STRIDE: Int = 0x8A3C

  /** @group Uniforms */
  val UNIFORM_MATRIX_STRIDE: Int = 0x8A3D

  /** @group Uniforms */
  val UNIFORM_IS_ROW_MAJOR: Int = 0x8A3E

  /** @group Uniforms */
  val UNIFORM_BLOCK_BINDING: Int = 0x8A3F

  /** @group Uniforms */
  val UNIFORM_BLOCK_DATA_SIZE: Int = 0x8A40

  /** @group Uniforms */
  val UNIFORM_BLOCK_ACTIVE_UNIFORMS: Int = 0x8A42

  /** @group Uniforms */
  val UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Int = 0x8A43

  /** @group Uniforms */
  val UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Int = 0x8A44

  /** @group Uniforms */
  val UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Int = 0x8A46

  /** @groupname Sync_objects Sync objects */
  /** @group Sync_objects */
  val OBJECT_TYPE: Int = 0x9112

  /** @group Sync_objects */
  val SYNC_CONDITION: Int = 0x9113

  /** @group Sync_objects */
  val SYNC_STATUS: Int = 0x9114

  /** @group Sync_objects */
  val SYNC_FLAGS: Int = 0x9115

  /** @group Sync_objects */
  val SYNC_FENCE: Int = 0x9116

  /** @group Sync_objects */
  val SYNC_GPU_COMMANDS_COMPLETE: Int = 0x9117

  /** @group Sync_objects */
  val UNSIGNALED: Int = 0x9118

  /** @group Sync_objects */
  val SIGNALED: Int = 0x9119

  /** @group Sync_objects */
  val ALREADY_SIGNALED: Int = 0x911A

  /** @group Sync_objects */
  val TIMEOUT_EXPIRED: Int = 0x911B

  /** @group Sync_objects */
  val CONDITION_SATISFIED: Int = 0x911C

  /** @group Sync_objects */
  val WAIT_FAILED: Int = 0x911D

  /** @group Sync_objects */
  val SYNC_FLUSH_COMMANDS_BIT: Int = 0x00000001

  /** @groupname Miscellaneous_constants Miscellaneous constants */
  /** @group Miscellaneous_constants */
  val COLOR: Int = 0x1800

  /** @group Miscellaneous_constants */
  val DEPTH: Int = 0x1801

  /** @group Miscellaneous_constants */
  val STENCIL: Int = 0x1802

  /** @group Miscellaneous_constants */
  val MIN: Int = 0x8007

  /** @group Miscellaneous_constants */
  val MAX: Int = 0x8008

  /** @group Miscellaneous_constants */
  val DEPTH_COMPONENT24: Int = 0x81A6

  /** @group Miscellaneous_constants */
  val STREAM_READ: Int = 0x88E1

  /** @group Miscellaneous_constants */
  val STREAM_COPY: Int = 0x88E2

  /** @group Miscellaneous_constants */
  val STATIC_READ: Int = 0x88E5

  /** @group Miscellaneous_constants */
  val STATIC_COPY: Int = 0x88E6

  /** @group Miscellaneous_constants */
  val DYNAMIC_READ: Int = 0x88E9

  /** @group Miscellaneous_constants */
  val DYNAMIC_COPY: Int = 0x88EA

  /** @group Miscellaneous_constants */
  val DEPTH_COMPONENT32F: Int = 0x8CAC

  /** @group Miscellaneous_constants */
  val DEPTH32F_STENCIL8: Int = 0x8CAD

  /** @group Miscellaneous_constants */
  val INVALID_INDEX: Int = 0xFFFFFFFF

  /** @group Miscellaneous_constants */
  val TIMEOUT_IGNORED: Int = -1

  /** @group Miscellaneous_constants */
  val MAX_CLIENT_WAIT_TIMEOUT_WEBGL: Int = 0x9247
}
